package com.project.hotelManagementSystem.entity.constants;

public enum HotelType implements BaseEnum<Integer>{

    APARTMENT(1),
    VILLA(2),
    CONDO(3),
    STUDIO(4),
    BUNGALOW(5),
    COTTAGE(6),
    PENTHOUSE(7),
    LOFT(8),
    CABIN(9),
    GLAMPING_TENT(10);

    private final int value;

    HotelType(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
