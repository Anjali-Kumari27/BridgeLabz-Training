package com.objectmodeling.selfproblems.ecommerceplatformscommunicationaggregation;

import java.util.ArrayList;

public class Order {

    private int orderId;

    // Aggregation: Order contains Products
    private ArrayList<Product> products = new ArrayList<>();

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("-------------------------------------");
        
        double total = 0;

        for (Product p : products) {
            p.showProduct();
            total += p.getPrice();
        }

        System.out.println("-------------------------------------");
        System.out.println("Total Amount: ₹" + total);
    }
}