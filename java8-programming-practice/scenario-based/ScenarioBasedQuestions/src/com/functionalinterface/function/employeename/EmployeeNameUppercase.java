package com.functionalinterface.function.employeename;
/*
 * 4.Convert employee name into uppercase.
 */
import java.util.Scanner;
import java.util.function.Function;

public class EmployeeNameUppercase {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Name : ");
        String employeeName = input.nextLine();

        // Function to convert name to uppercase
        Function<String, String> toUpperCase =
                name -> name.toUpperCase();

        String result = toUpperCase.apply(employeeName);

        System.out.println("Original Name: " + employeeName);
        System.out.println("Uppercase Name: " + result);
    }

}
