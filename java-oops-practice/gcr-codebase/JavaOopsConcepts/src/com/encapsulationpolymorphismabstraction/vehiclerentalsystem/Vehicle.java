package com.encapsulationpolymorphismabstraction.vehiclerentalsystem;

public abstract class Vehicle {
	// Encapsulation
    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    // Sensitive data (encapsulated)
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String policyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = policyNumber;
    }

    // Getters only (no direct access)
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    // Common method
    public void displayVehicleDetails() {
        System.out.println("Vehicle No : " + vehicleNumber);
        System.out.println("Type       : " + type);
    }

}
