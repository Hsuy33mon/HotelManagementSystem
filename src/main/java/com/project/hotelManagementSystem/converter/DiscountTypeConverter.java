package com.project.hotelManagementSystem.converter;

import com.project.hotelManagementSystem.entity.constants.DiscountType;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class DiscountTypeConverter extends BaseEnumConverter<DiscountType,Integer> {
    public DiscountTypeConverter() {super(DiscountType.class);}
}
