package com.addressbooksystem;

/*
 * Address class represents address details of a contact
 * Demonstrates composition (Contact HAS-A Address)
 */
public class Address {

    private String city;
    private String state;
    private String zip;

    // Constructor
    public Address(String city, String state, String zip) {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // Getters
    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    // Display address details
    public String toString() {
        return city + ", " + state + " - " + zip;
    }
}
