package com.encapsulationpolymorphismabstraction.ecommerceplatform;

//Abstract class for all products
public abstract class Product {
	
	// Encapsulation: private fields
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters & setters with validation
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        if (productId > 0) {
            this.productId = productId;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    // Abstract method for discount
    public abstract double calculateDiscount();

    // Common method
    public void displayProduct() {
        System.out.println("Product ID : " + productId);
        System.out.println("Name       : " + name);
        System.out.println("Price      : " + price);
    }

}
