package com.project.hotelManagementSystem.entity.constants;

public enum CurrencyType implements BaseEnum<Integer> {
    USD(1),    // US Dollar
    EUR(2),    // Euro
    GBP(3),    // British Pound
    JPY(4),    // Japanese Yen
    AUD(5),    // Australian Dollar
    CAD(6),    // Canadian Dollar
    SGD(7),    // Singapore Dollar
    CNY(8),    // Chinese Yuan
    INR(9),    // Indian Rupee
    MMK(10);   // Myanmar Kyat

    private final int value;


    CurrencyType(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
