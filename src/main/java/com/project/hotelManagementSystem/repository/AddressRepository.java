package com.project.hotelManagementSystem.repository;

import com.project.hotelManagementSystem.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {

}
