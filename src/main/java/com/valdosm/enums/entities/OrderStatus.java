package com.valdosm.enums.entities;

public enum OrderStatus {
    PROMOVIDO(1),
    DEMIRIDO(2),
    CONTRATADO(3);

    private int cod;

    private OrderStatus(int cod) {
        this.cod = cod;
    }
    
    public int getCod() {
        return cod;
    }

    public static OrderStatus valuesOf(int cod){
        for (OrderStatus value : OrderStatus.values()) {
            if (cod == value.getCod()) {
                return value;
            }   
        } 
             
        throw new IllegalArgumentException("Codigo inválido");
    }
}


