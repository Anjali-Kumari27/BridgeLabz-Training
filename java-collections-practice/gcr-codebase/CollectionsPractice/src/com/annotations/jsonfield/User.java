package com.annotations.jsonfield;

public class User {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    // Constructor to initialize values
    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }
}

