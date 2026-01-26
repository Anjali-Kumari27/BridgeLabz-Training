package com.dealtracker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Deal {
    String dealCode;
    LocalDate validTill;
    int discount; // percentage
    int minimumPurchase;

    public Deal(String dealCode, LocalDate validTill, int discount, int minimumPurchase) {
        this.dealCode = dealCode;
        this.validTill = validTill;
        this.discount = discount;
        this.minimumPurchase = minimumPurchase;
    }

    @Override
    public String toString() {
        return dealCode + " | ValidTill: " + validTill + " | Discount: " + discount + "% | MinPurchase: " + minimumPurchase;
    }
}

