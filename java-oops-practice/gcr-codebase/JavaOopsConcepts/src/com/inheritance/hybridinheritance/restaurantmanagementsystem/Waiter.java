package com.inheritance.hybridinheritance.restaurantmanagementsystem;

public class Waiter extends Person implements Worker {

    private int tableCount;

    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println("Role        : Waiter");
        System.out.println("Tables Handled : " + tableCount);
        System.out.println("Duties      : Serving food and assisting customers");
    }
}
