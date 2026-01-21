package com.variousinterfaces.queueinterface.hospitaltiragesystem;

public class Patient {
	String name; // Patient name
	int severity; // Severity level (higher number = more serious)

	// Constructor
	Patient(String name, int severity) {
		this.name = name;
		this.severity = severity;
	}
}
