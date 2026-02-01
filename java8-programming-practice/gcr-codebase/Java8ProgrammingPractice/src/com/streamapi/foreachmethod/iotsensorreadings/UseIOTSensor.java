package com.streamapi.foreachmethod.iotsensorreadings;

import java.util.*;

/*
 IoT Sensor Readings
 ○ Scenario: Print all readings above threshold.
 ○ Task: Use streams with forEach().
 */
public class UseIOTSensor {

	public static void main(String[] args) {

		double threshold = 50.0;

		List<Sensor> sensorReadings = Arrays.asList(
				new Sensor("S1", 45.5),
				new Sensor("S2", 52.3),
				new Sensor("S3", 48.9),
				new Sensor("S4", 61.2),
				new Sensor("S5", 55.0)
		);

		// Stream processing
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("       Critical Sensor Readings (Above " + threshold + ")      ");
		System.out.println("-------------------------------------------------------------\n");

		sensorReadings.stream()
				// Filter elements based on a criteria
				.filter(s -> s.getReading() > threshold)

				// Iterate through every element present in the stream
				.forEach(s -> System.out.println(s));
	}
}