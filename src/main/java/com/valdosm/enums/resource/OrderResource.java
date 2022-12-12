package com.valdosm.enums.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valdosm.enums.entities.Order;
import com.valdosm.enums.service.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
    @Autowired
    private OrderService service;
    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> List = service.findAll();
        return ResponseEntity.ok().body(List);
    }
    
}
