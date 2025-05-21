package com.project.hotelManagementSystem.entity.constants;

public enum UserRole implements BaseEnum<Integer>{
    ADMIN(1),
    EDITOR(2),
    CUSTOMER(3);

    private final int value;

    UserRole(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
