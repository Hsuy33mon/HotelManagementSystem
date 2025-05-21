package com.project.hotelManagementSystem.entity.constants;

public enum CartStatus implements BaseEnum<Integer> {
    ACTIVE(1),
    EXPIRED(2);

    private final int value;

    CartStatus(int value) {
        this.value = value;
    }


    @Override
    public Integer getValue() {
        return value;
    }
}
