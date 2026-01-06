package com.edumentor;

public class Learner extends User {
    public Learner(String name, String email, int userId) {
        super(name, email, userId);
    }

    @Override
    public void roleInfo() {
        System.out.println("Role: Learner");
    }
}

