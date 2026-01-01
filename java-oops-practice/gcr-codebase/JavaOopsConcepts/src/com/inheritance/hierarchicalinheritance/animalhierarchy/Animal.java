package com.inheritance.hierarchicalinheritance.animalhierarchy;

public class Animal {

    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
