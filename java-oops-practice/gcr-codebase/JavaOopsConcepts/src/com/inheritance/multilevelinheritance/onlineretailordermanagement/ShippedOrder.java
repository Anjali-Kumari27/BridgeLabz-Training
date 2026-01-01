package com.inheritance.multilevelinheritance.onlineretailordermanagement;

public class ShippedOrder extends Order {

    protected String trackingNumber;

    // Constructor
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);   // call Order constructor
        this.trackingNumber = trackingNumber;
    }

    // Overriding getOrderStatus()
    @Override
    String getOrderStatus() {
        return "Order Shipped (Tracking No: " + trackingNumber + ")";
    }
}
