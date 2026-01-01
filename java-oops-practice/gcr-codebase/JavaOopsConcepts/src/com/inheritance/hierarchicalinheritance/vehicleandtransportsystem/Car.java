package com.inheritance.hierarchicalinheritance.vehicleandtransportsystem;

public class Car extends Vehicle {

    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type : Car");
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}