package com.annotations.useoverride;

public class UseAnimal {
    public static void main(String[] args) {

        Animal a = new Dog();  // Polymorphism
        a.makeSound();        // Dog ka method chalega
    }
}
