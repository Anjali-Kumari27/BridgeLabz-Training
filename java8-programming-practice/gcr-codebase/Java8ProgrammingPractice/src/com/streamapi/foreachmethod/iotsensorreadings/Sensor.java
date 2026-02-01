package com.streamapi.foreachmethod.iotsensorreadings;


/*
 * Represents an IoT sensor with 
 * a unique ID and current reading.
 */
public class Sensor {

	private String sensorId;
	private double reading;

	public Sensor(String sensorId, double reading) {
		this.sensorId = sensorId;
		this.reading = reading;
	}

	public String getSensorId() {
		return sensorId;
	}

	public double getReading() {
		return reading;
	}

	@Override
	public String toString() {
		return "Sensor ID: " + sensorId + " | Reading: " + reading;
	}
}
