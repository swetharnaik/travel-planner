package com.example.shopping.service;

import com.example.shopping.models.Order;
import com.example.shopping.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).get();
    }
}
