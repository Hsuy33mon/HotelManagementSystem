package com.project.hotelManagementSystem.entity;

import com.project.hotelManagementSystem.converter.DiscountTypeConverter;
import com.project.hotelManagementSystem.entity.constants.DiscountType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "promotions")
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String code;
    @Column(name = "discount_type")
    @Convert(converter = DiscountTypeConverter.class)
    private DiscountType discountType;
    @Column
    private double discountAmount;
    @Column
    private LocalDate startDate;
    @Column
    private LocalDate endDate;
    @Column
    private int pointAmount;
    @Column
    private int usageLimit;
    @Column
    private int timesUsed;

    @ManyToMany(mappedBy = "promotions")
    private Set<User> users = new HashSet<>();

    @ManyToMany(mappedBy = "promotions")
    private Set<Room> rooms = new HashSet<>();

    @ManyToMany(mappedBy = "promotions")
    private Set<Hotel> hotels = new HashSet<>();
}
