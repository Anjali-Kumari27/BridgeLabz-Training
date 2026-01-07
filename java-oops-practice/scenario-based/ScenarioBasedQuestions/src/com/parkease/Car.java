package com.parkease;

public class Car extends Vehicle {

	// Constructor to create a Car object
    public Car(String vehicleNumber) {
    	
    	// Call parent constructor, ₹50 per hour
        super(vehicleNumber, 50); 
    }

    // Calculate parking charges for the car
    @Override
    public double calculateCharges(int hours) {
    	
        double charge = baseRate * hours;
        if (hours > 5) {
            charge += 100; // penalty
        }
        return charge;
    }

    // Return type of vehicle
    @Override
    public String getType() {
        return "Car";
    }
}

