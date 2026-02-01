package com.interfaces.staticmethod.passwordstrengthvalidator;
/*
 * 1. Password Strength Validator
   ○ Scenario: In an insurance portal, password policy rules are centrally defined.
   ○ Task: Create a static method in an interface SecurityUtils to check password
strength.
 */
public interface SecurityUtils {

	// Static method to check password strength
	static boolean isStrongPassword(String password) {
		// Minimum 8 characters, at least one uppercase, one number
		return password.length() >= 8 && 
				password.matches(".*[A-Z].*") && // at least one uppercase
				password.matches(".*[0-9].*") && // at least one number
				password.matches(".*[!@#$%^&*()].*"); // at least one special character
	}

}
