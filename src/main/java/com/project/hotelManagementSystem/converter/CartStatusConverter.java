package com.project.hotelManagementSystem.converter;


import com.project.hotelManagementSystem.entity.constants.CartStatus;
import jakarta.persistence.Convert;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class CartStatusConverter extends BaseEnumConverter<CartStatus,Integer> {
    public CartStatusConverter() {super(CartStatus.class);}
}
