package com.swiftcartgroceryshoppingapp;

public abstract class Product {

    protected String name;
    protected double price;
    protected String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public abstract double getDiscountedPrice(double coupon); // polymorphic
}

