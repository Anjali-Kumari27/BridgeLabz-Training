package com.encapsulationpolymorphismabstraction.vehiclerentalsystem;

public class Bike extends Vehicle implements Insurable {

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate, policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) - 50; // discount
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance (Policy: " + getInsurancePolicyNumber() + ")";
    }
}
