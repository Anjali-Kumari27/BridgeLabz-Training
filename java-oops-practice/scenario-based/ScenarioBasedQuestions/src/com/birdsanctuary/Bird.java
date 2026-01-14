package com.birdsanctuary;

public abstract class Bird {

	private int id;
    private String name;
    private String species;

    // Constructor
    public Bird(int id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    // Common behavior
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Display bird details
    public void displayInfo() {
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
    }

}
