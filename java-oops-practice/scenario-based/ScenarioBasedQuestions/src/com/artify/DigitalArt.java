package com.artify;

public class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist, double price) {
        super(title, artist, price, "Digital License");
    }

    @Override
    public void purchase(User user) {
        if (user.getWalletBalance() >= price) {
            user.deductBalance(price);
            System.out.println("\nDigital artwork purchased successfully!");
        } else {
            System.out.println("\nInsufficient wallet balance");
        }
    }

    @Override
    public void license() {
    	if (getSelectedLicense().equalsIgnoreCase("Personal")) {
            setLicensingTerms("Personal use only. No resale allowed.");
        } 
        else if (getSelectedLicense().equalsIgnoreCase("Commercial")) {
            setLicensingTerms("Commercial usage allowed with attribution.");
        }

        System.out.println("License Type: " + licenseType);
        System.out.println("Selected License: " + getSelectedLicense());
        System.out.println("License Terms: " + getLicensingTerms());
    }

    @Override
    public void displayDetails() {
        System.out.println("Digital Art | " + title +
                " | Artist: " + artist +
                " | INR " + price);
    }
}
