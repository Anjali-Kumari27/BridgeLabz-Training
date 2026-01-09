package com.artify;

public class PrintArt extends Artwork {

	public PrintArt(String title, String artist, double price) {
		super(title, artist, price, "Print License");
	}

	@Override
	public void purchase(User user) {
		if (user.getWalletBalance() >= price) {
			user.deductBalance(price);
			System.out.println("\nPrint artwork purchased successfully!");
		} else {
			System.out.println("\nInsufficient wallet balance");
		}
	}

	@Override
	public void license() {
		if (getSelectedLicense().equalsIgnoreCase("Single Print")) {
	        setLicensingTerms("Only one physical copy allowed.");
	    } 
	    else if (getSelectedLicense().equalsIgnoreCase("Commercial Print")) {
	        setLicensingTerms("Multiple prints allowed for commercial sale.");
	    }

	    System.out.println("License Type: " + licenseType);
	    System.out.println("Selected License: " + getSelectedLicense());
	    System.out.println("License Terms: " + getLicensingTerms());
	}

	@Override
	public void displayDetails() {
		System.out.println("Print Art | " + title + " | Artist: " + artist + " | INR " + price);
	}
}
