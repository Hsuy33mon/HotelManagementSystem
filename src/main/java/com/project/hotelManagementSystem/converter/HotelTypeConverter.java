package com.project.hotelManagementSystem.converter;


import com.project.hotelManagementSystem.entity.constants.HotelType;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class HotelTypeConverter extends BaseEnumConverter<HotelType,Integer>{
    public HotelTypeConverter() {super(HotelType.class);}
}
