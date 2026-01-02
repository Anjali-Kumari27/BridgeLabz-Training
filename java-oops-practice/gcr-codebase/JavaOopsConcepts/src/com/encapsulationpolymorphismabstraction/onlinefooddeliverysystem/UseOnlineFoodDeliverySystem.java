package com.encapsulationpolymorphismabstraction.onlinefooddeliverysystem;

import java.util.List;
import java.util.ArrayList;

//Main class to use the Online Food Delivery System
public class UseOnlineFoodDeliverySystem {
	
	public static void main(String[] args) {

		// Create a list to store food items in the order
        List<FoodItem> orderItems = new ArrayList<>();

        // Add vegetarian and non-vegetarian items
        orderItems.add(new VegItem("Paneer Butter Masala", 250, 2));
        orderItems.add(new NonVegItem("Chicken Biryani", 300, 1));

        // Process the order and calculate total
        OrderProcessor.processOrder(orderItems);
    }

}
