package com.upgrad.eshop.validators;

import com.upgrad.eshop.dtos.OrderRequest;
import com.upgrad.eshop.dtos.ProductDTO;
import com.upgrad.eshop.exceptions.APIException;
import com.upgrad.eshop.exceptions.ProductNotFoundException;

public interface ProductValidator {
    public void getProduct(ProductDTO productDTO) throws ProductNotFoundException;
}