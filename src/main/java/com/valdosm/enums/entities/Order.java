package com.valdosm.enums.entities;

import java.time.Instant;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Instant moment;

    
    private Integer orderStatus;
    
    public Order(){

    }

    public Order(Integer id, Instant moment, OrderStatus orderStatus) {
        this.id = id;
        this.moment = moment;
        setStatus(orderStatus);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return  OrderStatus.valuesOf(orderStatus);
    }

    public void setStatus(OrderStatus orderStatus) {
        if(orderStatus != null){
            this.orderStatus  = orderStatus.getCod();
        }
    }
    
    
}
