package com.project.hotelManagementSystem.entity.constants;

public enum PaymentStatus implements BaseEnum<Integer>{
    PENDING(1),
    PAID(2),
    FAILED(3),
    REFUNDED(4),
    PARTIALLY_PAID(5);

    private final int value;

    PaymentStatus(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
