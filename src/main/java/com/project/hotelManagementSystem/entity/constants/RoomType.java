package com.project.hotelManagementSystem.entity.constants;

public enum RoomType implements BaseEnum<Integer>{
    SINGLE(1),
    DOUBLE(2),
    TWIN(3),
    TRIPLE(4),
    SUITE(5),
    DELUXE(6),
    FAMILY(7),
    KING(8),
    QUEEN(9),
    STUDIO(10);

    private final int value;

    RoomType(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
