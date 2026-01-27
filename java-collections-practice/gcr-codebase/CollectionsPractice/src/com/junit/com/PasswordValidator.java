package com.junit.com;

public class PasswordValidator {
	private static final String PASSWORD_REGEX =
            "^(?=.*[A-Z])(?=.*\\d).{8,}$";
	
	public boolean isValid(String password) {

        if (password == null) {
            throw new IllegalArgumentException("Password cannot be null");
        }

        // matches() checks the regex
        if (!password.matches(PASSWORD_REGEX)) {
            throw new IllegalArgumentException("Weak password");
        }

        return true;
    }

}
