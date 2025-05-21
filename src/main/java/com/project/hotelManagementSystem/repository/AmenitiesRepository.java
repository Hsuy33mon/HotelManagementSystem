package com.project.hotelManagementSystem.repository;

import com.project.hotelManagementSystem.entity.Amenities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmenitiesRepository extends JpaRepository<Amenities,Long> {
}
