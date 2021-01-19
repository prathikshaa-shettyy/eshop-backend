package com.upgrad.eshop.validators;

import com.upgrad.eshop.dtos.OrderRequest;
import com.upgrad.eshop.exceptions.APIException;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderValidatorImpl implements OrderValidator {
    @Autowired
    OrderValidator orderValidator;

    public void validateOrderRequest(OrderRequest orderRequest) throws APIException{

    }
}
