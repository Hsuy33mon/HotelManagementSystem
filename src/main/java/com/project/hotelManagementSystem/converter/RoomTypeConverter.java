package com.project.hotelManagementSystem.converter;

import com.project.hotelManagementSystem.entity.constants.RoomType;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class RoomTypeConverter extends BaseEnumConverter<RoomType,Integer> {
    public RoomTypeConverter() {super(RoomType.class);}
}
