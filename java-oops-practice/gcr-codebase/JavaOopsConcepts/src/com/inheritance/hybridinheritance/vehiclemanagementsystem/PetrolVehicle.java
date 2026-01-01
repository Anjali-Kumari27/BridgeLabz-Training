package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class PetrolVehicle extends Vehicle implements Refuelable {

    private int fuelTankCapacity; // in liters

    public PetrolVehicle(int maxSpeed, String model, int fuelTankCapacity) {
        super(maxSpeed, model);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling petrol vehicle...");
        System.out.println("Fuel Tank Capacity : " + fuelTankCapacity + " liters");
    }
}
