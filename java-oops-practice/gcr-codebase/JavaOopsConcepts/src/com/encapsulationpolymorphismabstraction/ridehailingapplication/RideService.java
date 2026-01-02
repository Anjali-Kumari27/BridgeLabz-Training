package com.encapsulationpolymorphismabstraction.ridehailingapplication;

import java.util.List;

public class RideService {
	
	// Calculates fare for different vehicle types
	public static void calculateFares(List<Vehicle> vehicles, double distance) {

		// Loop through all vehicles
        for (Vehicle vehicle : vehicles) {

        	// Display basic vehicle and driver details
            vehicle.getVehicleDetails();
            
            // Show travel distance
            System.out.println("Distance     : " + distance + " km");
            System.out.println("Total Fare   : " + vehicle.calculateFare(distance));

            // Check if vehicle supports GPS
            if (vehicle instanceof GPS) {
            	
            	// Type cast to GPS interface
                GPS gps = (GPS) vehicle;
                System.out.println("Location     : " + gps.getCurrentLocation());
            }

            System.out.println("--------------------------------");
        }
    }

}
