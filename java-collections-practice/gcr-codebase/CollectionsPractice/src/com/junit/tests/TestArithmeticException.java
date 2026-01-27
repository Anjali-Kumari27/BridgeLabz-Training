package com.junit.tests;

/*
 * Testing Exception Handling
Problem:
Create a method divide(int a, int b) that throws an ArithmeticException if b is zero. Write a JUnit test to verify that the exception is thrown properly.

 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.com.DivideByZero;
public class TestArithmeticException {
	
	DivideByZero div;
	
	@BeforeEach
	void setup() {
		div = new DivideByZero();
	}
	
	@Test
	void testDivideByZero() {
		ArithmeticException e = assertThrows(ArithmeticException.class, () -> div.divide(10,0));
		
		assertEquals("Cannot divide by zero", e.getMessage());
	}
	
	@Test
	void testDivideNormal() {
		assertEquals(2, div.divide(10, 5));
	}
}
