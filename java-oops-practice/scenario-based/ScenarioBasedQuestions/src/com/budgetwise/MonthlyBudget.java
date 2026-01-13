package com.budgetwise;

public class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, String[] categories, double[] limits) {
        super(income, categories, limits);
    }

    // Polymorphism
    @Override
    public void generateReport() {
    	System.out.println("\n------------------------------------------------------");
        System.out.println("                     Monthly Budget                     ");
        System.out.println("------------------------------------------------------\n");
        for (int i = 0; i < tCount; i++) {
            Transaction t = transactions[i];
            System.out.println(
                t.getDate() + " | " +
                t.getCategory() + " | " +
                t.getAmount()
            );
        }
        System.out.println("Total Income: " + income);
        System.out.println("Expenses: " + totalExpenses);
        System.out.println("Savings: " + calculateSavings());
    }
}
