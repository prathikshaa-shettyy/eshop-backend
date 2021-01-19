package com.upgrad.eshop.dtos;

import lombok.Data;

@Data
public class ShippingAddressDTO {
    private String name;
    private String phone;
    private String street;
    private String landmark;
    private String city;
    private String state;
    private String pincode;
    int userId;
}