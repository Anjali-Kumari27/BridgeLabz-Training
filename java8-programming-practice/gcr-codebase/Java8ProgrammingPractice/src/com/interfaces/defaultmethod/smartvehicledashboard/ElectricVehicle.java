package com.interfaces.defaultmethod.smartvehicledashboard;

public class ElectricVehicle implements VehicleDashboard {

	String name;
    int speed;
    int battery;

    public ElectricVehicle(String name, int speed, int battery) {
        this.name = name;
        this.speed = speed;
        this.battery = battery;
    }
	@Override
	public void displaySpeed() {
		// TODO Auto-generated method stub
		System.out.println(name + " speed: " + speed + " km/h");
	}

	// overriding default method
	public void displayBattery() {
		System.out.println("Battery left: " + battery + "%");

        if (battery < 20) {
            System.out.println("Low battery, charge soon");
        }
	}
}
