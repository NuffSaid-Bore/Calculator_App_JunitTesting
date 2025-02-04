package com.java.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode

public class User {

    public enum UserType {REGULAR_USER, ADMIN_USER}
    
    private String username;
    private String password;
    private boolean live = true;
    private final  UserType userType;
}
