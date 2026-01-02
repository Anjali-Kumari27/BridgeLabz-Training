package com.hospitalpatientmanagementsystem;

//Bill implements Payable interface
public class Bill implements Payable {

    private double baseAmount;
    private double tax = 0.05;
    private double discount = 0.10;

    public Bill(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    //Implementation of interface method
    @Override
    public double calculatePayment() {
        double taxAmount = baseAmount * tax;
        double discountAmount = baseAmount * discount;
        return baseAmount + taxAmount - discountAmount;
    }
}


