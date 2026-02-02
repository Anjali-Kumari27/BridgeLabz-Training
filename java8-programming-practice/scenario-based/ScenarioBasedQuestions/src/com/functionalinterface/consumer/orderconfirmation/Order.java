package com.functionalinterface.consumer.orderconfirmation;

public class Order {
    String orderId;
    String customerName;
    double amount;

    Order(String orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }
}
