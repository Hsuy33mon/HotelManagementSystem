package com.project.hotelManagementSystem.entity.constants;

public enum BookingStatus implements BaseEnum<Integer>{
    PENDING(1),
    CONFIRMED(2),
    CANCELLED(3),
    REJECTED(4);

    private final int value;

    BookingStatus(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
