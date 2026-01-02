package com.vehiclerentalapplication;

public class UseVehicleRentalApplication {
	    public static void main(String[] args) {
	        Customer client = new Customer("Anjali", "C101");
	        
	        // Polymorphism in action
	        Rentable myCar = new Car("V-CAR-01", "Tesla Model 3", 2000);
	        Rentable myTruck = new Truck("V-TRK-99", "Volvo FH", 5000, 10.5);
	        
	        int days = 5;
	        
	        // Calculate and display
	        double carPrice = myCar.calculateRent(days);
	        client.printInvoice((Vehicle)myCar, days, carPrice);
	        
	        double truckPrice = myTruck.calculateRent(days);
	        client.printInvoice((Vehicle)myTruck, days, truckPrice);
	    }
}
