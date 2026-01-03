package com.cabbygoridehailingapp;

public class Mini extends Vehicle {
	
	// Constructor to initialize Mini vehicle details
    public Mini(String vehicleNumber) {
    	
    	// Calls parent (Vehicle) constructor
    	// 4 seats, type = Mini
        super(vehicleNumber, 4, "Mini");
    }

    @Override
    // Returns fare rate per kilometer for Mini
    public double getRatePerKm() {
        return 80.0;
    }
}