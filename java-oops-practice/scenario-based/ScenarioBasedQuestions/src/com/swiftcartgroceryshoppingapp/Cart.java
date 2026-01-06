package com.swiftcartgroceryshoppingapp;

import java.util.ArrayList;

public class Cart implements ICheckout {

    private ArrayList<Product> products;
    private double totalPrice;

    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    public Cart(ArrayList<Product> preSelected) {
        products = new ArrayList<>(preSelected);
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.price; // initial sum
        }
    }

    public void addProduct(Product p, int quantity) {
        for (int i = 0; i < quantity; i++) {
            products.add(p);
            totalPrice += p.price;
        }
        System.out.println(quantity + " x " + p.name + " added to cart.");
    }

    @Override
    public void applyDiscount(double couponAmount) {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getDiscountedPrice(couponAmount);
        }
        System.out.println("Coupon of " + couponAmount + " applied.");
    }

    @Override
    public void generateBill() {
        System.out.println("\n========= Bill Details ==========");
        System.out.println("Items in Cart:");
        for (Product p : products) {
            System.out.println(p.name + " - INR " + p.price );
        }
        System.out.println("Total Amount: INR " + totalPrice); 
    }
}