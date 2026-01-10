package com.medistore;

public class Tablet extends Medicine {

    public Tablet(String name, double price, String expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        // Tablets preserved ( expiry slow )
        return isExpiredByDate();
    }

    @Override
    public void displayDetail() {
        System.out.println("Medicine Type : Tablet");
        System.out.println("Name          : " + name);
        System.out.println("Expiry Date   : " + expiryDate);
    }
}
