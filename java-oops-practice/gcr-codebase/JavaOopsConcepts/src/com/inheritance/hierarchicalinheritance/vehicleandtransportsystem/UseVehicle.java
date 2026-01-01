package com.inheritance.hierarchicalinheritance.vehicleandtransportsystem;

public class UseVehicle {
	public static void main(String[] args) {

        // Array of superclass type
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10);
        vehicles[2] = new Motorcycle(140, "Petrol", true);

        // Polymorphic method calls
        for (Vehicle v : vehicles) {
            System.out.println("-------------------------");
            v.displayInfo();  // runtime polymorphism
        }
    }


}
