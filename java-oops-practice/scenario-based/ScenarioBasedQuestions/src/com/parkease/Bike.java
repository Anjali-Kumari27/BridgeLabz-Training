package com.parkease;

public class Bike extends Vehicle {

	//Constructor to create a Bike object
    public Bike(String vehicleNumber) {
    	
    	// Call parent constructor, ₹20 per hour
        super(vehicleNumber, 20); 
    }

    // Calculate parking charges for the bike
    @Override
    public double calculateCharges(int hours) {
    	
    	// Base charge
        double charge = baseRate * hours;
        
        // Extra charge for long parking
        if (hours > 6) {
            charge += 50;
        }
        return charge;
    }

    
    // Return type of vehicle
    @Override
    public String getType() {
        return "Bike";
    }
}

