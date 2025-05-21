package com.project.hotelManagementSystem.converter;

import com.project.hotelManagementSystem.entity.constants.UserRole;
import jakarta.persistence.Converter;
import org.springframework.data.relational.core.sql.In;

@Converter(autoApply = true)
public class UserRoleConverter extends BaseEnumConverter<UserRole,Integer> {
    public UserRoleConverter() {super(UserRole.class);}
}
