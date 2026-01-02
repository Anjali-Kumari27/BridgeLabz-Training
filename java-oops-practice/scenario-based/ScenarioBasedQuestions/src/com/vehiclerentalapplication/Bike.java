package com.vehiclerentalapplication;

//Bike class inherits Vehicle
public class Bike extends Vehicle implements Rentable {
	
    public Bike(String vehicleId, String model, double baseRate) {
        super(vehicleId, model, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        // Bikes are simple: just base rate per day
        return baseRate * days;
    }
}

