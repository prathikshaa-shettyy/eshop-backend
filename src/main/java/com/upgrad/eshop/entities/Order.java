package com.upgrad.eshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ESHOP_ORDER")
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    @JsonBackReference
    @Column(name="user_id")
    private User user;

    @OneToOne
    @Column(name = "productId")
    private Product product;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JsonBackReference
    @Column(name = "shippingAddressId")
    @JoinColumn(name = "id")
    private ShippingAddress shippingAddress;

//  TODO: Define the 'Product' field with reference to the Product entity and use the necessary relationship annotation

//  TODO: Define the 'shippingAddress' field with reference to the ShippingAddress entity and use the necessary relationship annotation

    private Double amount;
    private LocalDateTime orderDate = LocalDateTime.now();



}