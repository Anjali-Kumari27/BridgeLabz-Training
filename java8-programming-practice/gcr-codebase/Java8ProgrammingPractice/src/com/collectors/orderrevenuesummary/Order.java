package com.collectors.orderrevenuesummary;

public class Order {
    private String customerName;
    private double orderAmount;

    // Constructor
    public Order(String customerName, double orderAmount) {
        this.customerName = customerName;
        this.orderAmount = orderAmount;
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    @Override
    public String toString() {
        return customerName + " -> " + orderAmount;
    }
}

