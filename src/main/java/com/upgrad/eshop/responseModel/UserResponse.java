package com.upgrad.eshop.responseModel;

import lombok.Data;

@Data
public class UserResponse {
    int userId;
    String userName;
    String password;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String successMessage;
    String jwtToken;
    String refreshToken;
}