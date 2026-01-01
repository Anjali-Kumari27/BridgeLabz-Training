package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class UseVehicle {
	public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle(160, "Tesla Model 3", 75);
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City", 40);

        System.out.println("==========Electric Vehicle==========");
        ev.displayInfo();
        ev.charge();

        System.out.println("\n===========Petrol Vehicle===========");
        pv.displayInfo();
        pv.refuel();
    }

}
