package com.encapsulationpolymorphismabstraction.vehiclerentalsystem;

public class Car extends Vehicle implements Insurable {

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate, policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.10;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance (Policy: " + getInsurancePolicyNumber() + ")";
    }
}
