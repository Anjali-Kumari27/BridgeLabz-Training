package com.junit.tests;

import org.junit.jupiter.api.Test;

import com.junit.com.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {
	Calculator cal;
	@BeforeEach
	void setup() {
		cal = new Calculator();
	}
	@Test
	void testAddition() {
		assertEquals(10,cal.add(5,5), "Addition should be correct");
	}
	@Test
	void testSubtraction() {
		assertEquals(2,cal.subtract(5,3), "Subtraction should be correct");
	}
	@Test
	void testMultiplication() {
		assertEquals(15,cal.multiply(5,3), "Multiplication should be correct");
	}
	@Test
	void testDivision() {
		assertEquals(2,cal.divide(10,5), "Division should be correct");
	}
	
	@Test
	void testDivisionByZero() {
		assertThrows(ArithmeticException.class, () -> cal.divide(10,0));
	}
}
