package com.interfaces.defaultmethod.smartvehicledashboard;

public class UseSmartVehicle {
	public static void main(String[] args) {

		VehicleDashboard bike = new PetrolVehicle("Bike", 60);
        VehicleDashboard car = new ElectricVehicle("EV Car", 70, 15);

        System.out.println("Petrol Vehicle:");
        bike.displaySpeed();
        bike.displayBattery(); // default method

        System.out.println();

        System.out.println("Electric Vehicle:");
        car.displaySpeed();
        car.displayBattery(); // overridden method
	}

}
