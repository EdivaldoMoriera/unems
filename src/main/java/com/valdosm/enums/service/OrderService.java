package com.valdosm.enums.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdosm.enums.entities.Order;
import com.valdosm.enums.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;
    public List<Order> findAll(){
        return repository.findAll();
        
    }
    
}
