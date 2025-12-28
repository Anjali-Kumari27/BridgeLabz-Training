package com.constructor.levelone;

public class Vehicle {
		
		//Instance variables
		private String ownerName;
		private String vehicleType;
		
		//class variable (static) shared among all product objects
		static double registrationFee = 280.5;
		
		
		//Parameterized constructor
		Vehicle(String ownerName , String vehicleType){
			
			//this keyword used to refer instance variable
			this.ownerName = ownerName;
			this.vehicleType = vehicleType;
			
		}
		
		
		//Instance method to display details of Vehicle
		void displayVehicleDetails() {
			
			System.out.println("Owner Name : " + ownerName);
			System.out.println("Type of Vehicle : " + vehicleType);
			System.out.println("Registration Fee : " + registrationFee);
			System.out.println();
			
		}

		
		//static method to update name registration Fee 
		static void updateRegistrationFee(double newRegistrationFee) {
			
			registrationFee = newRegistrationFee;
		}
		
		
		
		
		
		public static void main(String[] main) {
			
			//created objects for Vehicle
			Vehicle vehicle1 = new Vehicle("Car" , "SUV");
			Vehicle vehicle2 = new Vehicle("Scooter" , "Honda");
			
			//calling instance method using object
			vehicle1.displayVehicleDetails();
			vehicle2.displayVehicleDetails();
			
			//update registration fee
			Vehicle.updateRegistrationFee(450.5);
			
			//displaying updated registration fee
			System.out.println("Updated Registration Fee : " + Vehicle.registrationFee);
			
		}

}
