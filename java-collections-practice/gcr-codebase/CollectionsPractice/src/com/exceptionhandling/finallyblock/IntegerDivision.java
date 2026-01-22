package com.exceptionhandling.finallyblock;

import java.util.Scanner;

public class IntegerDivision {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            // Taking user input
            System.out.print("Enter first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter second number: ");
            int num2 = input.nextInt();

            // Performing division
            int result = num1 / num2;

            // Print result if no exception occurs
            System.out.println("Result: " + result);
        }
        // Handles division by zero
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
        finally {
            // This block always executes
            System.out.println("Operation completed");
            input.close(); 
        }
    }
}

