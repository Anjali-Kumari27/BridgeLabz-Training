/*Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.
*/


import java.util.Scanner;

public class ParkingLotSystem {

    // stores current parked cars
    int parkedCars = 0;


    //Method to show parking system working
    public static void showMenu() {

        System.out.println("\n========= Parking Lot Menu =========");

        System.out.println("Enter your choice according to your need given below");
        System.out.println("1. Park Car");
        System.out.println("2. Exit Car");
        System.out.println("3. Show Occupancy");
        System.out.println("4. Exit System");
        System.out.print("Enter your choice: ");

    }




    //Method for parking cars
    public void parkCar(int maxCapacity) {

        //if we have not reached to maximum capacity, increment the parkedCars value
        if (parkedCars < maxCapacity) {

            parkedCars++;

            System.out.println("Car parked successfully!");

        } 

        else {

            System.out.println("Parking lot is FULL!");

        }

    }






    // main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // create object for non-static methods
        ParkingLotSystem parking = new ParkingLotSystem();


        // take capacity from user for the maximum car parking
        System.out.print("Enter maximum parking capacity: ");

        int maxCapacity = input.nextInt();


        System.out.println("\nWelcome to Parking Lot Gate System");


        
        //user choice according to their need
        int choice;

        while (parking.parkedCars < maxCapacity) {

            showMenu();
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    parking.parkCar(maxCapacity);
                    break;

                case 2:
                    if (parking.parkedCars > 0) {

                        parking.parkedCars--;
                        System.out.println("Car exited successfully!");

                    } 
                    else {
                        System.out.println("Parking lot is EMPTY!");
                    }
                    break;

                case 3:
                    System.out.println("Occupancy: "
                            + parking.parkedCars + "/" + maxCapacity);
                    break;

                case 4:
                    System.out.println("Exiting Parking System...");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice!");

            }

        }


        System.out.println("\nParking lot is FULL!!!");
        input.close();

    }
}
