package com.inheritance.hybridinheritance.restaurantmanagementsystem;

public class Chef extends Person implements Worker {

    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Role      : Chef");
        System.out.println("Specialty : " + specialty);
        System.out.println("Duties    : Cooking food and managing kitchen");
    }
}
