package com.project.hotelManagementSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String road;

    @Column
    private double latitude;

    @Column
    private double longitude;

    @Column
    private String zipCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="city_id")
    private City city;

    @OneToOne(mappedBy = "address")
    private Hotel hotel;

}
