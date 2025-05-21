package com.project.hotelManagementSystem.entity;

import com.project.hotelManagementSystem.converter.CurrencyTypeConverter;
import com.project.hotelManagementSystem.converter.PaymentStatusConverter;
import com.project.hotelManagementSystem.entity.constants.CurrencyType;
import com.project.hotelManagementSystem.entity.constants.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private double amount;
    @Column
    private String payment_method;
    @Column
    private LocalDateTime payment_date;
    @Column(name = "payment_status")
    @Convert(converter = PaymentStatusConverter.class)
    private PaymentStatus paymentStatus;
    @Column(name = "currency_type")
    @Convert(converter = CurrencyTypeConverter.class)
    private CurrencyType currencyType;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "payment")
    private Invoice invoice;

    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

}
