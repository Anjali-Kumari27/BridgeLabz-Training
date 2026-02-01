package com.interfaces.staticmethod.unitconversiontool;

import java.util.Scanner;

public class UseUnitConversion {
	
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\n===============================================================");
        System.out.println("                       Unit Conversion Tool                      ");
        System.out.println("===============================================================\n");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Kilograms to Pounds");
        System.out.print("\nChoose conversion (1-2): ");
        int choice = input.nextInt();

        System.out.print("Enter value to convert: ");
        double value = input.nextDouble();

        System.out.println("\n---------------------------------------------------------------");
        if (choice == 1) {
            double miles = UnitConverter.kmToMiles(value);
            System.out.println(value + " km = " + miles + " miles");
        } 
        else if (choice == 2) {
            double lbs = UnitConverter.kgToLbs(value);
            System.out.println(value + " kg = " + lbs + " lbs");
        } 
        else {
            System.out.println("Invalid choice");
        }

        input.close();
    }

}
