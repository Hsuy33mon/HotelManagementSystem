package com.project.hotelManagementSystem.entity;

import com.project.hotelManagementSystem.converter.RoomTypeConverter;
import com.project.hotelManagementSystem.entity.constants.RoomType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private double price;
    @Column
    private boolean isAvailable;
    @Column
    private String description;
    @Column(name = "room_type")
    @Convert(converter = RoomTypeConverter.class)
    private RoomType roomType;
    @Column
    private int maxCapacity;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    @ManyToMany
    @JoinTable(name = "room_amentities",
    joinColumns = @JoinColumn(name = "room_id"),
    inverseJoinColumns = @JoinColumn(name = "amentities_id"))
    private Set<Amenities> amentities = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "room_promotions",
    joinColumns = @JoinColumn(name = "room_id"),
    inverseJoinColumns =  @JoinColumn(name = "promotion_id"))
    private Set<Promotion> promotions = new HashSet<>();
}
