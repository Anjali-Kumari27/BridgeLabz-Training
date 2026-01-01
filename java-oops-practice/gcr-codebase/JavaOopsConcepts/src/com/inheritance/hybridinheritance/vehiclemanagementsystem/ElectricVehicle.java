package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class ElectricVehicle extends Vehicle {

    private int batteryCapacity; // in kWh

    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println("Charging electric vehicle...");
        System.out.println("Battery Capacity : " + batteryCapacity + " kWh");
    }
}
