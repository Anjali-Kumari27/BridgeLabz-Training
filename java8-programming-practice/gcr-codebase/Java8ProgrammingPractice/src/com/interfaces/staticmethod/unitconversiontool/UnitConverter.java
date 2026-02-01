package com.interfaces.staticmethod.unitconversiontool;
/*
 * Unit Conversion Tool
   ○ Scenario: Logistics software needs standard unit conversions (km to miles, kg to
lbs).
   ○ Task: Implement conversions as static interface methods.
 */
public interface UnitConverter {

	// convert kilometers to miles
	static double kmToMiles(double km) {
		return km * 0.621371;
	}

	// convert kilograms to pounds
	static double kgToLbs(double kg) {
		return kg * 2.20462;
	}

}
