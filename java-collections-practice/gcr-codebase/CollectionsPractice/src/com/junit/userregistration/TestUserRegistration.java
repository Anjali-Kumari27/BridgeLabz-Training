package com.junit.userregistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestUserRegistration {
	UserRegistration user = new UserRegistration();

	@Test
	void testValidUserRegistration() {
		assertTrue(user.registerUser("Anjali", "anjali@gmail.com", "password123"));
	}

	@Test
	void testInvalidEmail() {
		assertThrows(IllegalArgumentException.class, () -> {
			user.registerUser("Anjali", "anjaligmail.com", "password123");
		});
	}

	@Test
	void testInvalidPassword() {
		assertThrows(IllegalArgumentException.class, () -> {
			user.registerUser("Anjali", "anjali@gmail.com", "123");
		});
	}

}
