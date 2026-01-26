package com.dealtracker;

import java.util.*;

public class Promotion<T> {
    T type; // Discount, Cashback, Referral

    Map<String, Deal> deals; // dealCode → Deal

    public Promotion(T type) {
        this.type = type;
        deals = new HashMap<>();
    }

    public void addDeal(String code, Deal deal) {
        deals.put(code, deal);
    }

    public Map<String, Deal> getDeals() {
        return deals;
    }

    public T getType() {
        return type;
    }
}

