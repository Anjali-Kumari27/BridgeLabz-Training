package com.exceptionhandling.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dividing {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            // Ask user for first number
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();

            // Ask user for second number
            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            // Perform division
            int result = num1 / num2;

            // Print result if no exception occurs
            System.out.println("Result: " + result);

        }
        // Handles division by zero
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
        // Handles non-numeric input
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only");
        }
        finally {
            
        	input.close();
        }
    }
}

