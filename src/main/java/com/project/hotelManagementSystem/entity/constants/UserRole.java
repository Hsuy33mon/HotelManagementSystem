package com.project.hotelManagementSystem.entity.constants;

import lombok.Getter;

public enum UserRole implements BaseEnum<Integer>{
    ADMIN(1,"Admin"),
    EDITOR(2,"Editor"),
    CUSTOMER(3,"Customer");

    private final int value;
    @Getter
    private final String label;

    UserRole(int value,String label) {
        this.value = value;
        this.label = label;
    }

    @Override
    public Integer getValue() {
        return value;
    }

}
