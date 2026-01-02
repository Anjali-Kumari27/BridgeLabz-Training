package com.encapsulationpolymorphismabstraction.ridehailingapplication;

public class Auto extends Vehicle implements GPS {

    private String currentLocation = "Unknown";

    public Auto(String vehicleId, String driverName) {
        super(vehicleId, driverName, 10);
    }

    @Override
    public double calculateFare(double distance) {
        return (distance * ratePerKm) + 20; // base charge
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
