package com.encapsulationpolymorphismabstraction.ridehailingapplication;

import java.util.List;
import java.util.ArrayList;

public class UseRideHailingApplication {
	
	public static void main(String[] args) {

		// Create list to store different vehicle types
        List<Vehicle> vehicles = new ArrayList<>();

        // Create vehicle objects
        Car car = new Car("CAR101", "Shyam");
        Bike bike = new Bike("BIKE202", "Ravi");
        Auto auto = new Auto("AUTO303", "Suresh");

        // Update current location using GPS
        car.updateLocation("City Center");
        bike.updateLocation("Railway Station");
        auto.updateLocation("Bus Stand");

        // Add vehicles to list
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Calculate fare for all vehicles (polymorphism)
        RideService.calculateFares(vehicles, 12);
    }

}
