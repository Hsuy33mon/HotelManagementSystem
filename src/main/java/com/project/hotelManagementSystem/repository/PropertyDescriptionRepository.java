package com.project.hotelManagementSystem.repository;

import com.project.hotelManagementSystem.entity.PropertyDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyDescriptionRepository extends JpaRepository<PropertyDescription,Long> {
}
