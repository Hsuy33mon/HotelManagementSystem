package com.project.hotelManagementSystem.repository;

import com.project.hotelManagementSystem.entity.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion,Long> {
}
