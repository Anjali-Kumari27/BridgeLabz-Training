package com.swiftcartgroceryshoppingapp;

public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public double getDiscountedPrice(double coupon) {
    	
        // Non-perishable: flat coupon discount
        double discounted = price - coupon;
        return discounted > 0 ? discounted : 0;
    }
}

