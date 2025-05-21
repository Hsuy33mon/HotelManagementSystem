package com.project.hotelManagementSystem.entity;

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
@Table(name = "amentities")
public class Amenities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String description;

    @ManyToMany(mappedBy = "amentities")
    private Set<Room> rooms = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Amenities parent;

    @OneToMany(mappedBy = "parent")
    private Set<Amenities> children = new HashSet<>();
}
