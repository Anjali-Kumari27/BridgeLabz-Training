package com.cabbygoridehailingapp;

public class SUV extends Vehicle {
	
	// Constructor to initialize SUV vehicle details
    public SUV(String vehicleNumber) {
    	
    	// Calls parent (Vehicle) constructor
    	// 7 seats, type = SUV
        super(vehicleNumber, 7, "SUV");
    }

    @Override
    public double getRatePerKm() {
        return 125.0;
    }
}
