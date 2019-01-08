package com.kingbom.functionalprogramming.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String username;

    private String firstName;

    private String lastName;

    private Boolean active;


}
