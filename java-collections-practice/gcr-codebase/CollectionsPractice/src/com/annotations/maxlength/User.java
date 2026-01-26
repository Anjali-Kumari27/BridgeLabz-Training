package com.annotations.maxlength;

import java.lang.reflect.Field;

public class User {

    // Username should not exceed 10 characters
    @MaxLength(10)
    private String username;

    // Constructor
    public User(String username) {

        // Validate username length using annotation
        validateMaxLength(username);

        // Assign value if validation passes
        this.username = username;
    }

    // Validation method
    private void validateMaxLength(String value) {
        try {
            // Get Field object of username
            Field field = this.getClass().getDeclaredField("username");

            // Check if MaxLength annotation is present
            if (field.isAnnotationPresent(MaxLength.class)) {

                // Get annotation object
                MaxLength maxLength = field.getAnnotation(MaxLength.class);

                // Check length
                if (value.length() > maxLength.value()) {
                    throw new IllegalArgumentException(
                        "Username length must be <= " + maxLength.value()
                    );
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    //getter method
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
}

