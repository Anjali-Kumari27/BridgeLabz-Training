package com.payxpress;

import java.time.LocalDate;

public abstract class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected LocalDate dueDate;

    private boolean isPaid;

    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // Apply late fee if due date passed
    protected double calculateLateFee() {
        LocalDate today = LocalDate.now();
        if (today.isAfter(dueDate)) {
            return amount + 100;   // penalty
        }
        return amount;
    }

    // Encapsulation: getter for isPaid
    public boolean isPaid() {
        return isPaid;
    }

    @Override
    public void pay() {
        if (isPaid) {
            System.out.println(type + " bill already paid.");
        } else {
            isPaid = true;
            System.out.println(type + " bill paid successfully.");
        }
    }

    // Display status including penalty if late
    public void displayStatus() {
        System.out.println("\nBill Type: " + type);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Amount (with penalty if late): INR " + calculateLateFee());
        System.out.println("Paid: " + isPaid);
    }

    @Override
    public abstract void sendReminder();
}
