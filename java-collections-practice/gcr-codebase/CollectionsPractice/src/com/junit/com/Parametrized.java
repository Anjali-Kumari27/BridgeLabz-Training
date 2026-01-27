package com.junit.com;

public class Parametrized {
	
	public boolean isEven(int number) {
		if(number < 0) {
			throw new IllegalArgumentException("Negative numbers not allowed : " + number);
		}
		
		return number%2 == 0;
	}

}
