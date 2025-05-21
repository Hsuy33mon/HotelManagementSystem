package com.project.hotelManagementSystem.entity;

import com.project.hotelManagementSystem.converter.CurrencyTypeConverter;
import com.project.hotelManagementSystem.entity.constants.CurrencyType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "cartItems")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private LocalDate checkinDate;
    @Column
    private LocalDate checkoutDate;
    @Column
    private int quantity;
    @Column
    private double price;
    @Column(name = "currency_type")
    @Convert(converter = CurrencyTypeConverter.class)
    private CurrencyType currencyType;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
}
