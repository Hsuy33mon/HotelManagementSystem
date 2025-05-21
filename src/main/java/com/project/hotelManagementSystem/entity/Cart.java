package com.project.hotelManagementSystem.entity;

import com.project.hotelManagementSystem.converter.CartStatusConverter;
import com.project.hotelManagementSystem.entity.constants.CartStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cart_status")
    @Convert(converter = CartStatusConverter.class)
    private CartStatus cartStatus;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user;

    @OneToMany(mappedBy = "cart")
    private List<CartItem> cartItems = new ArrayList<>();
}
