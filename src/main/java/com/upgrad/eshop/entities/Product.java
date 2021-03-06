package com.upgrad.eshop.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ESHOP_PRODUCT")
public class Product {
    @Id
    @GeneratedValue
    private Long productId;
    private String name;
    private String category;
    private double price;
    private String description;
    private String manufacturer;
    private int availableItems;
    private String imageUrl;
    private LocalDateTime created;
    private LocalDateTime updated;
    @OneToOne
    private Order order;

}