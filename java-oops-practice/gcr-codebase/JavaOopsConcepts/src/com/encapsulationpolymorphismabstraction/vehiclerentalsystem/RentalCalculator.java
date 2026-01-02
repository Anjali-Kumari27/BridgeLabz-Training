package com.encapsulationpolymorphismabstraction.vehiclerentalsystem;

import java.util.List;

//class to calculate rental and insurance costs
public class RentalCalculator {
	
	// Calculates costs for different vehicles
	public static void calculateCosts(List<Vehicle> vehicles, int days) {

		 // Loop through each vehicle
        for (Vehicle vehicle : vehicles) {

        	// Calculate rental cost using polymorphism
            double rentalCost = vehicle.calculateRentalCost(days);
            
            // Default insurance cost
            double insuranceCost = 0;

            // Check if vehicle supports insurance
            if (vehicle instanceof Insurable) {
            	
            	// Cast vehicle to Insurable interface
                Insurable insurable = (Insurable) vehicle;
                
                // Calculate insurance cost
                insuranceCost = insurable.calculateInsurance();
            }

            vehicle.displayVehicleDetails();
            System.out.println("Rental Cost    : " + rentalCost);
            System.out.println("Insurance Cost : " + insuranceCost);
            System.out.println("--------------------------------");
        }
    }

}
