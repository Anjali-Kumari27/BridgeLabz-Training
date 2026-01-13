package com.budgetwise;

public class Transaction {

    private double amount;
    private String type;      // income or expense
    private String date;
    private String category;

    // Constructor
    public Transaction(double amount, String type, String date, String category) {
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.category = category;
    }

    //getter methods
    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }
    
    public String getDate() {
        return date;
    }
}


