package com.encapsulationpolymorphismabstraction.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable {

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate, policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 500; // extra load charge
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance (Policy: " + getInsurancePolicyNumber() + ")";
    }
}
