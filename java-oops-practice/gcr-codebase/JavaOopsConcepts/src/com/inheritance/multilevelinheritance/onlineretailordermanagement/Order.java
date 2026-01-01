package com.inheritance.multilevelinheritance.onlineretailordermanagement;

public class Order {

    protected int orderId;
    protected String orderDate;

    // Constructor
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    String getOrderStatus() {
        return "Order Placed";
    }
}
