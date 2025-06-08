package com.msa.api.core.order;

public class Order {
    private int orderId;
    private String name;

    public Order(int orderId, String name) {
        this.orderId = orderId;
        this.name = name;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getName() {
        return name;
    }
}
