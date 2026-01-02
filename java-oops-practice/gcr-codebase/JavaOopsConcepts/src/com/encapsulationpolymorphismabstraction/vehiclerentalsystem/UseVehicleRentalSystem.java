package com.encapsulationpolymorphismabstraction.vehiclerentalsystem;

import java.util.List;
import java.util.ArrayList;

//Main class to use the Vehicle Rental System
public class UseVehicleRentalSystem {
	
	public static void main(String[] args) {

		//Create a list to store all vehicles available for rent
        List<Vehicle> vehicles = new ArrayList<>();

        // Add different types of vehicles to the list
        vehicles.add(new Car("MP09-1234", 2000, "CAR-INS-101"));
        vehicles.add(new Bike("MP09-5678", 500, "BIKE-INS-202"));
        vehicles.add(new Truck("MP09-9999", 4000, "TRUCK-INS-303"));

        // Calculate rental cost for each vehicle for 3 days
        RentalCalculator.calculateCosts(vehicles, 3);
    }

}
