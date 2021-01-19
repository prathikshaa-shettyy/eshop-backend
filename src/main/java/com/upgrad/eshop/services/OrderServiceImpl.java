package com.upgrad.eshop.services;


import com.upgrad.eshop.daos.OrderRepository;
import com.upgrad.eshop.daos.ProductRepository;
import com.upgrad.eshop.daos.ShippingAddressRepository;
import com.upgrad.eshop.daos.UserRepository;
import com.upgrad.eshop.dtos.OrderRequest;
import com.upgrad.eshop.dtos.ProductDTO;
import com.upgrad.eshop.dtos.RegisterRequest;
import com.upgrad.eshop.entities.Order;
import com.upgrad.eshop.exceptions.OrderNotFoundException;
import com.upgrad.eshop.exceptions.ProductNotFoundException;
import com.upgrad.eshop.exceptions.ShippingAddressNotFoundException;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderService orderService;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    OrderRequest orderRequest;

    @Autowired
    ProductDTO productDTO;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ShippingAddressRepository shippingAddressRepository;

    @Override
    public Order addOrder(OrderRequest orderRequest) throws ProductNotFoundException, ShippingAddressNotFoundException{
        Order order=new Order();
        order.setUser(userRepository.findById(orderRequest.getId()).get());
        order.setProduct(productRepository.findById(orderRequest.getProductId()).get());
        order.setShippingAddress(shippingAddressRepository.findById(orderRequest.getAddressId()).get());
        order.setAmount(orderRequest.getAmount());
        order.setOrderDate(orderRequest.getOrderDate());
        Order savedOrder =orderRepository.save(order);
        return savedOrder;
    }
    @Override
    public Order getOrderById(Long id) throws OrderNotFoundException{


    }
    @Override
    public Order saveOrder(Order order){
        Order savedOrder = orderRepository.save(order);
        return savedOrder;
    }
}