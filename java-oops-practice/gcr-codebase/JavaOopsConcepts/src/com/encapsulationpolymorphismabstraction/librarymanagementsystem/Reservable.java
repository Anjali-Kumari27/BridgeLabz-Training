package com.encapsulationpolymorphismabstraction.librarymanagementsystem;

public interface Reservable {
	
	void reserveItem(String borrowerName);

    boolean checkAvailability();

}
