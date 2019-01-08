package com.kingbom.functionalprogramming.dto;

import lombok.Data;

@Data
public class UserDto {

    private String username;

    private String fullName;

    private Boolean active;

    public UserDto() {
    }
}
