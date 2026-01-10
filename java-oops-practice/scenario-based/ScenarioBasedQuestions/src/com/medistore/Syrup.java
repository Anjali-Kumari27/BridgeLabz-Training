package com.medistore;

public class Syrup extends Medicine {

    public Syrup(String name, double price, String expiryDate) {
    	
    	//super keyword will call parent constructor
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        // Liquid medicine ( expires faster)
        return isExpiredByDate();
    }

    @Override
    public void displayDetail() {
        System.out.println("Medicine Type : Syrup");
        System.out.println("Name          : " + name);
        System.out.println("Expiry Date   : " + expiryDate);
    }
}
