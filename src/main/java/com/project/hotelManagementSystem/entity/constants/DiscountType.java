package com.project.hotelManagementSystem.entity.constants;

public enum DiscountType implements BaseEnum<Integer>{
    PERCENTAGE(1),
    FIXED_AMOUNT(2);

    private final int value;

    DiscountType(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
