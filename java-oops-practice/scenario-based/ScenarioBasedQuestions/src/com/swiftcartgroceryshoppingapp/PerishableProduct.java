package com.swiftcartgroceryshoppingapp;

public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public double getDiscountedPrice(double coupon) {
    	
        // Perishable products: extra 10% off
        double discounted = price * 0.9;
        discounted -= coupon;
        return discounted > 0 ? discounted : 0;
    }
}

