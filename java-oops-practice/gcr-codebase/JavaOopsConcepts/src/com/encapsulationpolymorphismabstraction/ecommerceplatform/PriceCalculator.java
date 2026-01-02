package com.encapsulationpolymorphismabstraction.ecommerceplatform;

import java.util.List;

public class PriceCalculator {
	
	   // Method to calculate final price of each product in the list
       public static void calculateFinalPrice(List<Product> products) {

    	    // Loop through each product
	        for (Product product : products) {

	        	// Default tax is 0
	            double tax = 0;

	            // Check if product implements Taxable interface
	            if (product instanceof Taxable) {
	            	
	            	//Cast to Taxable to call calculateTax()
	                Taxable taxable = (Taxable) product;
	                tax = taxable.calculateTax();
	            }

	            double discount = product.calculateDiscount();
	            double finalPrice = product.getPrice() + tax - discount;

	            
	            // Display product details and pricing breakdown
	            product.displayProduct();
	            System.out.println("Discount   : " + discount);
	            System.out.println("Tax        : " + tax);
	            System.out.println("Final Price: " + finalPrice);
	            System.out.println("--------------------------------");
	        }
	    }
}
