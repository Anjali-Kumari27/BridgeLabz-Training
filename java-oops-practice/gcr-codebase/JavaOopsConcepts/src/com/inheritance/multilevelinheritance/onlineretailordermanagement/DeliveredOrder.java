package com.inheritance.multilevelinheritance.onlineretailordermanagement;

public class DeliveredOrder extends ShippedOrder {

    private String deliveryDate;

    // Constructor
    public DeliveredOrder(int orderId, String orderDate,
                          String trackingNumber, String deliveryDate) {

        super(orderId, orderDate, trackingNumber); // call ShippedOrder constructor
        this.deliveryDate = deliveryDate;
    }

    // Overriding getOrderStatus()
    @Override
    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }

    // Main method
    public static void main(String[] args) {

        DeliveredOrder order = new DeliveredOrder(
                101,
                "10-Jan-2025",
                "TRK98765",
                "15-Jan-2025"
        );

        System.out.println("Order ID    : " + order.orderId);
        System.out.println("Order Date  : " + order.orderDate);
        System.out.println("Status      : " + order.getOrderStatus());
    }
}
