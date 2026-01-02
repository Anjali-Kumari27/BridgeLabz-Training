package com.encapsulationpolymorphismabstraction.ridehailingapplication;

public abstract class Vehicle {
	
	// Encapsulation: private fields
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getters only (secured access)
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID  : " + vehicleId);
        System.out.println("Driver Name : " + driverName);
    }

}
