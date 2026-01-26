package com.reflection.jsonrepresentation;

public class User {
    private String name;
    private int age;

 // No-arg constructor required for Reflection
    public User() {
    }

    // Optional: Display method (not needed for JSON)
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
}
