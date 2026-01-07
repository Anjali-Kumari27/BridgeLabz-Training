package com.parkease;

public class Truck extends Vehicle {

	// Constructor to create a Truck object
    public Truck(String vehicleNumber) {
    	
    	// Call parent constructor, ₹100 per hour
        super(vehicleNumber, 100); 
    }

    // Calculate parking charges for the truck
    @Override
    public double calculateCharges(int hours) {
        double charge = baseRate * hours;   // Base charge
       
        // Extra charge for long parking
        if (hours > 4) {            
            charge += 200;
        }
        return charge;
    }

    // Return type of vehicle
    @Override
    public String getType() {
        return "Truck";
    }
}

