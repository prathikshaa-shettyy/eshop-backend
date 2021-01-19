package com.upgrad.eshop.responseModel;

import com.upgrad.eshop.entities.Order;

import javax.persistence.OneToOne;
import java.time.LocalDateTime;

public class ProductDetail {
    Long productId;
    String name;
    String category;
    double price;
    String description;
    String manufacturer;
    int availableItems;
    String imageUrl;
    LocalDateTime created;
    LocalDateTime updated;
}
