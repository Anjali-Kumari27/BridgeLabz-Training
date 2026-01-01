package com.inheritance.hierarchicalinheritance.vehicleandtransportsystem;

public class Truck extends Vehicle {

    private double loadCapacity; // in tons

    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type : Truck");
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
