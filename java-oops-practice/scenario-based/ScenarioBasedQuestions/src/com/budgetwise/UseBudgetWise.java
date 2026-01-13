package com.budgetwise;

/*
BudgetWise – Personal Finance Tracker"
Story: BudgetWise helps users plan monthly budgets and track income/expenses across
categories.
Requirements:
● Transaction class: amount, type, date, category.
● Budget class: income, limit, categoryLimits[].
● Interface IAnalyzable with generateReport() and detectOverspend().
● Constructors for monthly budgets with custom categories.
● Use operators to calculate net savings: income - totalExpenses.
● Encapsulation: restrict direct expense editing.
● Inheritance: MonthlyBudget, AnnualBudget.
● Polymorphism: report format varies (monthly vs yearly).

*/

import java.util.Scanner;

public class UseBudgetWise{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter income: ");
        double income = input.nextDouble();
        
        System.out.print("Enter date (DD-MM-YYYY): ");
        String date = input.next();

        String[] categories = {"Food", "Travel", "Shopping"};
        
        //setting limits for food, travel and shopping
        double[] limits = {6000, 3500, 10000};

        Budget budget = new MonthlyBudget(income, categories, limits);

        int choice;
        do {
            System.out.println("\n=========================================================");
            System.out.println("                    BudgetWise Menu                        ");
            System.out.println("=========================================================\n");
            System.out.println("1. Add Expense");
            System.out.println("2. Generate Report");
            System.out.println("3. Detect Overspend");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            //taking user choice 
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount: ");
                    double amt = input.nextDouble();

                    System.out.print("Enter category (Food/Travel/Shopping): ");
                    String cat = input.next();

                    Transaction t = new Transaction(amt, "expense", date, cat);
                    budget.addExpense(t);
                    
                    System.out.println("Expense added.");
                    break;

                case 2:
                    budget.generateReport();
                    break;

                case 3:
                    budget.detectOverspend();
                    break;

                case 4:
                    System.out.println("\n*************************************************");
                    System.out.println("    Thankyou for using BudgetWise Platform.....    ");
                    System.out.println("*************************************************\n");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        input.close();
    }
}
