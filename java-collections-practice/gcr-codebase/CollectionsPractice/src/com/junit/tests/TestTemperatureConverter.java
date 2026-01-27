package com.junit.temperatureconverter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTemperatureConverter {
	TemperatureConverter converter = new TemperatureConverter();
	
	 @Test
	    void testCelsiusToFahrenheit() {
	        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.01);
	    }
	 @Test
	    void testFahrenheitToCelsius() {
	        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.01);
	    }
	 @Test
	    void testInvalidCelsius() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            converter.celsiusToFahrenheit(-300);
	        });
	    }
	 @Test
	    void testInvalidFahrenheit() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            converter.fahrenheitToCelsius(-500);
	        });
	    }

}
