package com.cabbygoridehailingapp;

public abstract class Vehicle implements IRideService {
	
	// Vehicle registration number
    protected String vehicleNumber;
    
    // Seating capacity of vehicle
    protected int capacity;
    
    // Type of vehicle (Mini / Sedan / SUV)
    protected String type;
    
    // Stores total fare after ride ends
    private double fare;

    
    // Constructor to initialize common vehicle details
    public Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

     // Abstract method to be implemented by child classes
    // Returns rate per kilometer
    public abstract double getRatePerKm();

    
    @Override
    // Method to book the ride
    public void bookRide(String pickup, String dropoff) {
        System.out.println("\n>>> SUCCESS: " + type + " (" + vehicleNumber + ") is assigned.");
        System.out.println("Route: " + pickup + " to " + dropoff);
    }

    
    @Override
    // Method to end the ride and calculate fare
    public void endRide(double distance) {
    	
    	// Base fare charged for every ride
        double baseFare = 50.0;
        
        // Calculating total fare using distance and rate per km
        this.fare = baseFare + (distance * getRatePerKm());
    }

    
    // Returns calculated fare
    public double getFare() { 
    	return fare; 
    }
    
    // Returns vehicle type
    public String getType() { 
    	return type;
    }
}