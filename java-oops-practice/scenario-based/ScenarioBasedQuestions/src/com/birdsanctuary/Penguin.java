package com.birdsanctuary;

//Penguin can swim but cannot fly
public class Penguin extends Bird implements Swimmable {

    public Penguin(int id, String name) {
        super(id, name, "Penguin");
    }

    public void swim() {
        System.out.println(getName() + " is swimming fast.");
    }
}

