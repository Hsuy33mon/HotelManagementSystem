package com.project.hotelManagementSystem.repository;

import com.project.hotelManagementSystem.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRepository extends JpaRepository<Policy,Long> {
}
