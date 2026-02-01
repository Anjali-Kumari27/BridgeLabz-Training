package com.interfaces.defaultmethod.smartvehicledashboard;

public class PetrolVehicle implements VehicleDashboard {

	String name;
    int speed;

    public PetrolVehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
	@Override
	public void displaySpeed() {
		// TODO Auto-generated method stub
		System.out.println(name + " speed: " + speed + " km/h");
	}

}
