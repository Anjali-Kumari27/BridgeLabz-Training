package com.functionalinterface.function.converttemperature;
/*
 * 5.Convert Celsius temperature into Fahrenheit.
 */
import java.util.Scanner;
import java.util.function.Function;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in celsius : ");
		double celsius = input.nextDouble();
		
		// Function to convert Celsius to Fahrenheit
        Function<Double, Double> celsiusToFahrenheit =
                c -> (c * 9 / 5) + 32;

        double fahrenheit = celsiusToFahrenheit.apply(celsius);

        System.out.println("Celsius: " + celsius);
        System.out.println("In Fahrenheit: " + fahrenheit);
	}

}
