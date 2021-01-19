package com.upgrad.eshop.daos;

import com.upgrad.eshop.entities.Product;
import com.upgrad.eshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}