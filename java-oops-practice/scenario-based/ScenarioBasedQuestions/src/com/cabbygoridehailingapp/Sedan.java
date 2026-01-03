package com.cabbygoridehailingapp;

public class Sedan extends Vehicle {
	
	// Constructor to initialize Sedan vehicle details
    public Sedan(String vehicleNumber) {
    	
    	// Calls parent (Vehicle) constructor
        super(vehicleNumber, 4, "Sedan");
    }

    @Override
    
    // Returns fare rate per kilometer for Sedan
    public double getRatePerKm() {
    	
        return 100.0;
        
    }
}