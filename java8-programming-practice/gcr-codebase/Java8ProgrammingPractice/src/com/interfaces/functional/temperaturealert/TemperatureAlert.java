package com.interfaces.functional.temperaturealert;

/*
 * 1. Temperature Alert System
○ Scenario: Alert if temperature crosses threshold.
○ Task: Use Predicate<Double> functional interface.
 */
import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlert {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// define threshold temperature
		double threshold = 40.0;

		// taking temperature from user
		System.out.print("Enter current temperature: ");
		double currentTemp = input.nextDouble();

		// Predicate to check temperature
		Predicate<Double> alertCheck = temp -> temp > threshold;

		if (alertCheck.test(currentTemp)) {
			System.out.println("Alert: Temperature crossed the limit!!!!");
		} else {
			System.out.println("Temperature is normal");
		}

		input.close();
	}
}
