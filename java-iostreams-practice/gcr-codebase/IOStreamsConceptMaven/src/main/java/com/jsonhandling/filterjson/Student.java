package com.jsonhandling.filterjson;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private int age;
	private String email;
	private List<String> skills;

	public Student() {
	} // default constructor

	public Student(int id, String name, int age, String email, List<String> skills) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.skills = skills;
	}

	// Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "User{id=" + id + ", name='" + name + "', age=" + age + ", email='" + email + "', skills=" + skills
				+ "}";
	}
}
