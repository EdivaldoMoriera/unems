package com.valdosm.enums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valdosm.enums.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
    
}
