package com.variousinterfaces.additionalquestion.shoppingcart;

public class Product {

    String name;
    double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Display product details
    public String toString() {
        return name + " => " + price;
    }
}

