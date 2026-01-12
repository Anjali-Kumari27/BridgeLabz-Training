package com.ambulanceroute;

public class HospitalUnit {

	//instance variables
    String unitName;          // Name of hospital unit
    boolean available;        // true = available, false = maintenance
    HospitalUnit next;        // Next unit (circular link)

    public HospitalUnit(String unitName, boolean available) {
        this.unitName = unitName;
        this.available = available;
        this.next = null;
    }
}


