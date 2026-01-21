package com.sorting.medwarehouse;


public class Medicine {

    String name;
    int expiryDays; // days remaining till expiry

    Medicine(String name, int expiryDays) {
        this.name = name;
        this.expiryDays = expiryDays;
    }
}
