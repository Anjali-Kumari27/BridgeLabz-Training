package com.medistore;

import java.util.Scanner;

public class UseMediStore {

    public static void main(String[] args) {

    	//Scanner class to take user input
        Scanner input = new Scanner(System.in);
        char continueSell;

        System.out.println("\n================================================================");
        System.out.println("                    Welcome to MediStore                          ");
        System.out.println("=================================================================");

        do {
            System.out.println("\nSelect Medicine Type:");
            System.out.println("1. Tablet");
            System.out.println("2. Syrup");
            System.out.println("3. Injection");

            int choice = input.nextInt();
            input.nextLine();

            System.out.print("Enter Medicine Name: ");
            String name = input.nextLine();

            System.out.print("Enter Price: ");
            double price = input.nextDouble();
            input.nextLine();

            System.out.print("Enter Expiry Date (yyyy-MM): ");
            String expiry = input.nextLine();

            //parent reference
            Medicine med;

            if (choice == 1)
                med = new Tablet(name, price, expiry);
            else if (choice == 2)
                med = new Syrup(name, price, expiry);
            else
                med = new Injection(name, price, expiry);

            System.out.println("\n-----------------------------------------------------------");
            System.out.println("                      Medicine Details                       ");
            System.out.println("------------------------------------------------------------");
            med.displayDetail();

            //check expiry status
            if (med.checkExpiry()) {
                System.out.println("\nMedicine is expired. Cannot sell.");
            } else {
                System.out.print("\nEnter Quantity to Sell: ");
                int qty = input.nextInt();
                med.sell(qty);
            }

            System.out.print("\nDo you want to sell another medicine? (y/n): ");
            continueSell = input.next().charAt(0);

        } while (continueSell == 'y' || continueSell == 'Y');

        System.out.println("\nThank you for visiting MediStore!");
        
        input.close();
    }
}
