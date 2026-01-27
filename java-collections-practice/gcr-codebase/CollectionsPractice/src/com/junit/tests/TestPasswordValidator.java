package com.junit.tests;

import org.junit.jupiter.api.Test;

import com.junit.com.PasswordValidator;

import static org.junit.jupiter.api.Assertions.*;

public class TestPasswordValidator {
	PasswordValidator validator = new PasswordValidator();

	@Test
	void testValidPassword() {
		assertTrue(validator.isValid("StrongPass1"));
	}

	@Test
	void testNoUppercase() {
		assertThrows(IllegalArgumentException.class, () -> {
			validator.isValid("password1");
		});
	}

	@Test
	void testNoDigit() {
		assertThrows(IllegalArgumentException.class, () -> {
			validator.isValid("Password");
		});
	}

	@Test
	void testShortPassword() {
		assertThrows(IllegalArgumentException.class, () -> {
			validator.isValid("Abc1");
		});
	}

}
