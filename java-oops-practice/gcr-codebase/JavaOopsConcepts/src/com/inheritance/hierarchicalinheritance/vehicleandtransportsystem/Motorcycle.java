package com.inheritance.hierarchicalinheritance.vehicleandtransportsystem;

public class Motorcycle extends Vehicle {

    private boolean hasCarrier;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type : Motorcycle");
        System.out.println("Carrier      : " + (hasCarrier ? "Yes" : "No"));
    }
}
