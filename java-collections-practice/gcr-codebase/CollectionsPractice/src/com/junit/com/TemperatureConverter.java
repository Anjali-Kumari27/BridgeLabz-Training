package com.junit.com;

public class TemperatureConverter {
	
	// Converts Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) { // below absolute zero
            throw new IllegalArgumentException("Invalid Celsius value");
        }
        return (celsius * 9 / 5) + 32;
    }

    // Converts Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        if (fahrenheit < -459.67) { // below absolute zero
            throw new IllegalArgumentException("Invalid Fahrenheit value");
        }
        return (fahrenheit - 32) * 5 / 9;
    }
}
