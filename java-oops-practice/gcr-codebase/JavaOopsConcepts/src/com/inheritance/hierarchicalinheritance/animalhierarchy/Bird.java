package com.inheritance.hierarchicalinheritance.animalhierarchy;

public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Bird chirps");
    }
}
