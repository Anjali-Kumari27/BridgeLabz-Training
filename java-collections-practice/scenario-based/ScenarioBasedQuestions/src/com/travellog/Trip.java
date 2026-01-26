package com.travellog;

import java.io.Serializable;

public class Trip implements Serializable {

    private static final long serialVersionUID = 1L;

    String city;
    String country;
    int duration;     // days
    String notes;

    public Trip(String city, String country, int duration, String notes) {
        this.city = city;
        this.country = country;
        this.duration = duration;
        this.notes = notes;
    }
}
