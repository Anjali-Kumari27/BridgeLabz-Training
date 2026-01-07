package com.parkease;

//Abstract class representing any vehicle
public abstract class Vehicle implements IPayable {

    protected String vehicleNumber;
    protected double baseRate;

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
    }

    // Abstract method to get type of vehicle (Car, Bike, Truck)
    public abstract String getType();
}

