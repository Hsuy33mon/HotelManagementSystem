package com.project.hotelManagementSystem.entity;

import com.project.hotelManagementSystem.converter.HotelTypeConverter;
import com.project.hotelManagementSystem.entity.constants.HotelType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String phoneNumber;

    @Column
    private String email;

    @Column
    private String description;

    @Column
    private double rating;

    @Column(name = "hotel_type")
    @Convert(converter = HotelTypeConverter.class)
    private HotelType hotelType;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToOne
    @JoinColumn(name = "propertyDescription_id")
    private PropertyDescription propertyDescription;

    @ManyToMany
    @JoinTable(name = "hotel_policy",
            joinColumns = @JoinColumn(name = "hotel_id"),
            inverseJoinColumns = @JoinColumn(name = "policy_id"))
    private Set<Policy> policies = new HashSet<>();

    @OneToMany(mappedBy = "hotel" ,cascade = CascadeType.ALL)
    private List<Room> rooms = new ArrayList<>();

    @OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
    private List<Booking> bookings = new ArrayList<>();

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();

    @OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
    private List<Invoice> invoices = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "hotel_promotion",
            joinColumns = @JoinColumn(name = "hotel_id"),
            inverseJoinColumns = @JoinColumn(name = "promotion_id"))
    private Set<Promotion> promotions = new HashSet<>();
}