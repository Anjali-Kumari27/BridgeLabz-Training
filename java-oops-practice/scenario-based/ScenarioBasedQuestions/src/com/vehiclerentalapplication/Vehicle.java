package com.vehiclerentalapplication;

//Abstract class - cannot create Vehicle object directly
public abstract class Vehicle {
	
    protected String vehicleId;
    protected String model;
    protected double baseRate;

    public Vehicle(String vehicleId, String model, double baseRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRate = baseRate;
    }

    // Encapsulation: Getters and Setters
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
}