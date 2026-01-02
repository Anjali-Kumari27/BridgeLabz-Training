package com.vehiclerentalapplication;

public class Customer {
    private String name;
    private String customerId;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public void printInvoice(Vehicle vehicle, int days, double amount) {
        System.out.println("--- Rental Invoice ---");
        System.out.println("Customer: " + name);
        System.out.println("Vehicle: " + vehicle.getModel());
        System.out.println("Days: " + days);
        System.out.println("Total Rent: ₹" + amount);
        System.out.println("=========================");
    }
}