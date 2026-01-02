package com.encapsulationpolymorphismabstraction.ridehailingapplication;

public class Car extends Vehicle implements GPS {

    private String currentLocation = "Unknown";

    public Car(String vehicleId, String driverName) {
        super(vehicleId, driverName, 15);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
