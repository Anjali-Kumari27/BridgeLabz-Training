package com.vehiclerentalapplication;

// Truck class inherits Vehicle
public class Truck extends Vehicle implements Rentable {
    private double loadCapacity; // in tons

    public Truck(String vehicleId, String model, double baseRate, double loadCapacity) {
        super(vehicleId, model, baseRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRent(int days) {
        // Trucks have an extra charge based on capacity
        double capacitySurcharge = loadCapacity * 100;
        return (baseRate * days) + (capacitySurcharge * days);
    }
}