package com.edumentor;

//base class
public class Instructor extends User {
    public Instructor(String name, String email, int userId) {
        super(name, email, userId);
    }

    @Override
    public void roleInfo() {
        System.out.println("Role: Instructor");
    }
}

