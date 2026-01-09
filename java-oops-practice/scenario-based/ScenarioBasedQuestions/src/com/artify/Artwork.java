package com.artify;

public abstract class Artwork implements IPurchasable {

    protected String title;
    protected String artist;
    protected double price;
    protected String licenseType;

    private String licensingTerms;     // Encapsulation
    private String selectedLicense;    // User selected license

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

    public abstract void displayDetails();
}
