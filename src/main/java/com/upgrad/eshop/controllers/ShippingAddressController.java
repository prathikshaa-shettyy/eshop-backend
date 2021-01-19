package com.upgrad.eshop.controllers;

import com.upgrad.eshop.daos.UserRepository;
import com.upgrad.eshop.dtos.ShippingAddressDTO;
import com.upgrad.eshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class ShippingAddressController {

    @Autowired
    UserService userService;



    @PostMapping(value = "/access-token/user-addresses",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addAddress(@RequestBody ShippingAddressDTO shippingAddressDTO){
        ResponseEntity responseEntity = null;
        try{
            if()
        }
    }
}