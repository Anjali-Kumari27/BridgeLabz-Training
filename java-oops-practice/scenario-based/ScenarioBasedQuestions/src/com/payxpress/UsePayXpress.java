package com.payxpress;

/*
 * "PayXpress – Utility Bill Payment System"
Story: PayXpress enables users to pay utility bills (electricity, water, internet) with tracking and
reminders.
Requirements:
● Bill class: type, amount, dueDate, isPaid.
● Interface IPayable with pay() and sendReminder().
● Use constructors to create recurring bills.
● Operators for calculating late fees: baseAmount + penalty.
● Encapsulation: prevent direct payment status changes.
● Inheritance: ElectricityBill, InternetBill, WaterBill.
● Polymorphism: reminders vary depending on utility type.
● Access Modifiers: payment details are internal only.
 */

import java.util.Scanner;
import java.time.LocalDate;

public class UsePayXpress {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Customer Name:");
        String customerName = input.nextLine();

        System.out.println("\nEnter Electricity Bill Amount:");
        double eAmt = input.nextDouble();
        System.out.println("Enter Electricity Due Date (yyyy-mm-dd):");
        LocalDate eDate = LocalDate.parse(input.next());

        System.out.println("\nEnter Water Bill Amount:");
        double wAmt = input.nextDouble();
        System.out.println("Enter Water Due Date (yyyy-mm-dd):");
        LocalDate wDate = LocalDate.parse(input.next());

        System.out.println("\nEnter Internet Bill Amount:");
        double iAmt = input.nextDouble();
        System.out.println("Enter Internet Due Date (yyyy-mm-dd):");
        LocalDate iDate = LocalDate.parse(input.next());

        Bill[] bills = {
            new ElectricityBill(eAmt, eDate),
            new WaterBill(wAmt, wDate),
            new InternetBill(iAmt, iDate)
        };

        while (true) {
            System.out.println("\n======================================================");
            System.out.println("                   Welcome to PayXpress                  ");
            System.out.println("======================================================\n");
            System.out.println("Customer : " + customerName);
            System.out.println("1. View Bill Status");
            System.out.println("2. Pay a Bill");
            System.out.println("3. Show Reminders for Unpaid Bills");
            System.out.println("0. Exit");

            System.out.print("\nEnter your Choice: ");
            int choice = input.nextInt();

            if (choice == 0) {
                System.out.println("\n----------------------------------------------------");
                System.out.println("Thank you for using PayXpress!!!");
                System.out.println("-----------------------------------------------------\n");
                break;
            }

            switch (choice) {
                case 1: 
                	// View all bills
                    for (Bill b : bills) {
                        b.displayStatus();
                    }
                    break;

                case 2: 
                	// Pay a bill
                    System.out.println("Select Bill to Pay:");
                    System.out.println("1. Electricity");
                    System.out.println("2. Water");
                    System.out.println("3. Internet");
                    int payChoice = input.nextInt();

                    if (payChoice >= 1 && payChoice <= 3)
                        bills[payChoice - 1].pay();
                    else
                        System.out.println("Invalid selection");
                    break;

                case 3: 
                	// Show reminders
                    for (Bill b : bills) {
                        if (!b.isPaid()) {
                            b.sendReminder();
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid option! Try again.");
            }
        }

        input.close(); 
    }
}
