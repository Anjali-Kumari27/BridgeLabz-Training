package com.skillforge;

public class User {

    protected int id;
    protected String name;
    protected String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void displayUser() {
        System.out.println("ID: " + id + " | Name: " + name + " | Email: " + email);
    }
}

