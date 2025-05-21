package com.project.hotelManagementSystem.entity;

import com.project.hotelManagementSystem.converter.UserRoleConverter;
import com.project.hotelManagementSystem.entity.constants.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String phone;
    @Column(name = "user_role")
    @Convert(converter = UserRoleConverter.class)
    private UserRole userRole;
    @Column
    private LocalDate dateOfBirth;
    @Column
    private String nationality;
    @Column
    private int point;
    @Column
    private LocalDateTime confirmedAt;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews= new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Invoice> invoices = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Payment> payments = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Cart> carts = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "user_promotion",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "promotion_id"))
    private Set<Promotion> promotions = new HashSet<>();
}

