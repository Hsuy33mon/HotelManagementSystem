package com.project.hotelManagementSystem.repository;

import com.project.hotelManagementSystem.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
}
