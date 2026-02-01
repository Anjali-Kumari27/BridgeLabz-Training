package com.streamapi.foreachmethod.emailnotifications;

/*
 * Represents a user with 
 * an email address.
 */
public class User {

	private String email;

	public User(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return email;
	}
}