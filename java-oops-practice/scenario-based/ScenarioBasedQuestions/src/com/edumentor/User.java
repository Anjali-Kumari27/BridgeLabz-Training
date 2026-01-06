package com.edumentor;

public abstract class User {

    protected String name;
    protected String email;
    protected int userId;

    public User(String name, String email, int userId) {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }

    public void displayUser() {
        System.out.println("User ID : " + userId);
        System.out.println("Name    : " + name);
        System.out.println("Email   : " + email);
    }

    // Optional abstract method (could be used for specific behaviors)
    public abstract void roleInfo();
}
