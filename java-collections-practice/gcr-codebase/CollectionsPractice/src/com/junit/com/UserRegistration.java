package com.junit.com;

public class UserRegistration {
	// Method to register a user
    public boolean registerUser(String username, String email, String password) {

        // Validate username
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Invalid username");
        }

        // Validate email
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }

        // Validate password
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Invalid password");
        }

        // If all validations pass
        return true; // user registered successfully
    }

}
