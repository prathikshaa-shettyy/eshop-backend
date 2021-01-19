package com.upgrad.eshop.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "ESHOP_USER")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String role;
    private LocalDateTime created;
    private LocalDateTime updated;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    @JsonManagedReference
    List<Order> orders;

    @OneToOne
    private ShippingAddress shippingAddress;


}