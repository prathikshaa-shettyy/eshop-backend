package com.upgrad.eshop.entities;



import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class ShippingAddress {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String phone;
    private String street;
    private String landmark;
    private String city;
    private String state;
    private String pincode;
    @OneToOne
    private User userId;

    @OneToMany(mappedBy = "shippingAddress")
    @JsonManagedReference
    List<ShippingAddress> shippingAddresses;


}