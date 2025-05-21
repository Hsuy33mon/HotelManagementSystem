package com.project.hotelManagementSystem.service;

import com.project.hotelManagementSystem.entity.Hotel;
import com.project.hotelManagementSystem.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HotelService {

    private final HotelRepository hotelRepository;

    public Hotel createHotel(Hotel hotel) {
        return this.hotelRepository.save(hotel);
    }

    public Hotel updateHotel(Long id,Hotel hotel) {
        Optional<Hotel> optionalHotel = this.hotelRepository.findById(id);
        if(optionalHotel.isPresent()) {
            Hotel updatedHotel = optionalHotel.get();
            updatedHotel.setName(hotel.getName());
            updatedHotel.setPhoneNumber(hotel.getPhoneNumber());
            updatedHotel.setEmail(hotel.getEmail());
            updatedHotel.setDescription(hotel.getDescription());
            updatedHotel.setRating(hotel.getRating());
            updatedHotel.setHotelType(hotel.getHotelType());
            return this.hotelRepository.save(updatedHotel);
        }
        return null;
    }

    public void deleteHotel(Long id) {
        Optional<Hotel> optionalHotel = hotelRepository.findById(id);
        if(optionalHotel.isPresent()) {
            this.hotelRepository.deleteById(id);
        }
    }

    public Hotel findHotelById(Long id) {
        return this.hotelRepository.findById(id).orElse(null);
    }

    public List<Hotel> findAllHotels() {
        return this.hotelRepository.findAll();
    }
}