package com.project.hotelManagementSystem.converter;

import com.project.hotelManagementSystem.entity.constants.PaymentStatus;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class PaymentStatusConverter extends BaseEnumConverter<PaymentStatus,Integer> {
    public PaymentStatusConverter() {super(PaymentStatus.class);}
}
