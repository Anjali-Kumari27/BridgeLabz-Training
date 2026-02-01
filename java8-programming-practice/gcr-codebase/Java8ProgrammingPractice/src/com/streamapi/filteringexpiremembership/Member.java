package com.streamapi.filteringexpiremembership;

import java.time.LocalDate;

/*
 * Represents a gym member with 
 * name and membership expiry date.
 */
public class Member {

	private String name;
	private LocalDate expiryDate;

	public Member(String name, LocalDate expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
	}

	public String getName() {
		return name;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	@Override
	public String toString() {
		return "Member: " + name + " | Expiry Date: " + expiryDate;
	}
}
