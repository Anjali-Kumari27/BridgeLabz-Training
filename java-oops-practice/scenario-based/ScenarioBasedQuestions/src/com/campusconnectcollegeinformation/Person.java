package com.campusconnectcollegeinformation;

public abstract class Person {
	
	//instance variables
	protected String name;
	protected String email;
	protected int id;
	
	public Person(String name, String email, int id) {
		this.name = name;
		this.email = email;
		this.id = id;
	}

	//abstract method
	public abstract void printDetails();
}
