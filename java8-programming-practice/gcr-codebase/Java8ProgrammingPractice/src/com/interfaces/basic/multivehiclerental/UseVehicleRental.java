package com.interfaces.basic.multivehiclerental;

import java.util.Scanner;

public class UseVehicleRental {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // creating objects
        Vehicle car = new Car("Swift", 200);
        Vehicle bike = new Bike("Pulsar", 100);
        Vehicle bus = new Bus("Mini", 400);

        System.out.println("\n=====================================================");
        System.out.println("              Vehicle Rental System                    ");
        System.out.println("=====================================================\n");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Bus");

        System.out.print("\nEnter your Choice : ");
        int option = input.nextInt();

        System.out.println("Enter hours: ");
        int hrs = input.nextInt();

        System.out.println("\n-----------------------------------------------------");
        if (option == 1) {
            car.rent(hrs);
            car.returnVehicle();
        } 
        else if (option == 2) {
            bike.rent(hrs);
            bike.returnVehicle();
        } 
        else if (option == 3) {
            bus.rent(hrs);
            bus.returnVehicle();
        } 
        else {
            System.out.println("Invalid option");
        }

        input.close();
    }

}
