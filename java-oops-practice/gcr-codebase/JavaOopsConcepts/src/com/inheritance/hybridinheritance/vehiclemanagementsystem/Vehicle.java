package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class Vehicle {

    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("\nModel     : " + model);
        System.out.println("Max Speed : " + maxSpeed + " km/h");
    }
}
