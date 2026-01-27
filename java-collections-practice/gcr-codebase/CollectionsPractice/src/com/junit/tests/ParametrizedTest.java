package com.junit.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.junit.com.Parametrized;

import static org.junit.jupiter.api.Assertions.*;
public class ParametrizedTest {
	Parametrized para = new Parametrized();
	
	//this test will run six times with the different given values
	@ParameterizedTest
	
	//this will provide multiple input values to a single methos
	@ValueSource(ints = {2,4,6,7,9,-5})
	void testIsEven(int number) {
		try {
			boolean result = para.isEven(number);
			
			if(number % 2 == 0) {
				assertTrue(result, number + "should be even");
			}else {
				assertFalse(result, number + "should be odd");
			}
		} catch(IllegalArgumentException e) {
			
			//handle negative number
			System.out.println("Exception caught : " + e.getMessage());
		}
	}

}
