package com.project.hotelManagementSystem.converter;

import com.project.hotelManagementSystem.entity.constants.BookingStatus;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class BookingStatusConverter extends BaseEnumConverter<BookingStatus,Integer> {

    public BookingStatusConverter() {
        super(BookingStatus.class);
    }
}
