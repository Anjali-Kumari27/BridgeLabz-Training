package com.generics.airesumescreeningsystem;

public class ProductManager extends JobRole {

    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public void evaluateSkills() {
        System.out.println("Evaluating: Product Strategy, Communication");
    }
}

