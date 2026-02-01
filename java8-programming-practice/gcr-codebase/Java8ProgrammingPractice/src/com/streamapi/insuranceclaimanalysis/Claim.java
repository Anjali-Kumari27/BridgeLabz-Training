package com.streamapi.insuranceclaimanalysis;

/*
 * Represents an insurance claim with 
 * a specific type and the claimed amount.
 */
public class Claim {

	private String type;
	private double amount;

	public Claim(String type, double amount) {
		this.type = type;
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return type + " | Amount: " + amount;
	}
}