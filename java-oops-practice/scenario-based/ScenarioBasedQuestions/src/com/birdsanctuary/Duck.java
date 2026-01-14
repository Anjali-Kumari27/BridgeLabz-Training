package com.birdsanctuary;

//Duck can fly and swim
public class Duck extends Bird implements Flyable, Swimmable {

    public Duck(int id, String name) {
        super(id, name, "Duck");
    }

    public void fly() {
        System.out.println(getName() + " is flying.");
    }

    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}

