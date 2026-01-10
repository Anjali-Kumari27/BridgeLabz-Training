package com.artify;

public abstract class Artwork implements IPurchasable {

	// instance variables
	protected String title;
	protected String artist;
	protected double price;
	protected String licenseType;

	// Encapsulation
	private String licensingTerms;
	private String selectedLicense;

	// Constructor without preview
	public Artwork(String title, String artist, double price, String licenseType) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
		this.licensingTerms = "Standard Usage";
	}

	// Setter & Getter for selected license
	public void setSelectedLicense(String selectedLicense) {
		this.selectedLicense = selectedLicense;
	}

	protected String getSelectedLicense() {
		return selectedLicense;
	}

	protected String getLicensingTerms() {
		return licensingTerms;
	}

	protected void setLicensingTerms(String terms) {
		this.licensingTerms = terms;
	}

	public double getPrice() {
		return price;
	}

	//abstract method (need to be override by sub classes)
	public abstract void displayDetails();
}
