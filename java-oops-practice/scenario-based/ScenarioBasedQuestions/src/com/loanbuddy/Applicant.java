package com.loanbuddy;

public class Applicant {

	//instance variables
    private String name;
    private int creditScore;
    private double income;
    private double loanAmount;

    //parametrized constructor to initialize variables
    public Applicant(String name, int creditScore, double income, double loanAmount) {
        this.name = name;
        this.creditScore = creditScore;
        this.income = income;
        this.loanAmount = loanAmount;
    }

    //getter method 
    public String getName() {
        return name;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public double getIncome() {
        return income;
    }

    public double getLoanAmount() {
        return loanAmount;
    }
}

