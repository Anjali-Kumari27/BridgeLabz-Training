package com.medistore;

public class Injection extends Medicine {

    public Injection(String name, double price, String expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        // Highly sensitive medicine
        return isExpiredByDate();
    }

    @Override
    public void displayDetail() {
        System.out.println("Medicine Type : Injection");
        System.out.println("Name          : " + name);
        System.out.println("Expiry Date   : " + expiryDate);
    }
}
