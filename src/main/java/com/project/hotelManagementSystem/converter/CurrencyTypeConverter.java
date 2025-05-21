package com.project.hotelManagementSystem.converter;

import com.project.hotelManagementSystem.entity.constants.CurrencyType;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class CurrencyTypeConverter extends BaseEnumConverter<CurrencyType,Integer> {
    public CurrencyTypeConverter() {super(CurrencyType.class);}
}
