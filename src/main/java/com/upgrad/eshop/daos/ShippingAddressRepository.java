package com.upgrad.eshop.daos;

import com.upgrad.eshop.entities.ShippingAddress;
import com.upgrad.eshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingAddressRepository extends JpaRepository<ShippingAddress, Long> {
}