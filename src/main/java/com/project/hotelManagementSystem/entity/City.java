package com.project.hotelManagementSystem.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;

    @OneToMany(mappedBy = "city")
    private List<Address> addresses;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;
}
