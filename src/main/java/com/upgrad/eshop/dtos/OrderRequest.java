package com.upgrad.eshop.dtos;

import java.time.LocalDateTime;

public class OrderRequest {
    private Long id;
    private Long addressId;
    private Long productId;
    private Double amount;
    private LocalDateTime orderDate;

    public OrderRequest() {
    }

    public OrderRequest(Long addressId, Long productId) {
        this.addressId = addressId;
        this.productId = productId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}