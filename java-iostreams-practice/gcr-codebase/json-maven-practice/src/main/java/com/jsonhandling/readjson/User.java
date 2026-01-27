package com.jsonhandling.readjson;

public class User {
	private String name;
	private String email;

	public User() {
	} // default constructor required by Jackson

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User{name='" + name + "', email='" + email + "'}";
	}
}
