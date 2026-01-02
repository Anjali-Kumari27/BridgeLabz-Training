package com.vehiclerentalapplication;

//Car class inherits Vehicle
public class Car extends Vehicle implements Rentable {
	
    private static final double AC_SURCHARGE = 500.0;

    public Car(String vehicleId, String model, double baseRate) {
        super(vehicleId, model, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        // Base rate * days + a flat AC surcharge for cars
        return (baseRate * days) + AC_SURCHARGE;
    }
}