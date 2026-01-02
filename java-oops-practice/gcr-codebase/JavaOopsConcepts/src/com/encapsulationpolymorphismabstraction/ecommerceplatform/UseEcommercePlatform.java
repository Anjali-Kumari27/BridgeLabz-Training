package com.encapsulationpolymorphismabstraction.ecommerceplatform;

import java.util.List;
import java.util.ArrayList;

//Main class to simulate an E-Commerce Platform
public class UseEcommercePlatform {
	
	public static void main(String[] args) {

		// List to store all products in the platform
        List<Product> products = new ArrayList<>();

        // Add different types of products
        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "Jacket", 4000));
        products.add(new Groceries(103, "Rice Bag", 1200));

        // Calculate final price of all products (with tax, discounts, etc.)
        PriceCalculator.calculateFinalPrice(products);
        
    }

}
