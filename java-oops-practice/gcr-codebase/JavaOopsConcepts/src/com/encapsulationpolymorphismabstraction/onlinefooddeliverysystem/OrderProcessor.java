package com.encapsulationpolymorphismabstraction.onlinefooddeliverysystem;

import java.util.List;

//Class to process a list of food items in an order
public class OrderProcessor {

	// Method to process order items
    public static void processOrder(List<FoodItem> items) {

    	// Keep track of total amount for the entire order
        double grandTotal = 0;

        // Loop through each item in the order
        for (FoodItem item : items) {

        	// Calculate the total price of this item (price * quantity)
            double totalPrice = item.calculateTotalPrice();
            
            // Default discount is 0
            double discount = 0;

            // Check if the item is eligible for discount
            if (item instanceof Discountable) {
            	
            	// Cast the item to Discountable to call applyDiscount()
                Discountable discountable = (Discountable) item;
                
                // Apply the discount
                discount = discountable.applyDiscount();
            }

            
            // Print the item details
            item.getItemDetails();
            System.out.println("Item Total : " + totalPrice);
            System.out.println("Discount   : " + discount);
            System.out.println("Final Price: " + (totalPrice - discount));
            System.out.println("--------------------------------");

            // Add the final price of this item to grand total
            grandTotal += (totalPrice - discount);
            
        }

        System.out.println("Grand Total Amount: " + grandTotal);
    }
}
