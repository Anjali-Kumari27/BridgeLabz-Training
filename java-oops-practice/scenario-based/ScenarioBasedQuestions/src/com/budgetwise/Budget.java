package com.budgetwise;

//Parent class
public class Budget implements IAnalyzable {

    //instance variables
    protected double income;
    protected double totalExpenses;
    
    //array for different type of caetogries, their limits and expenses on them
    protected String[] categories;
    protected double[] categoryLimits;
    protected double[] categoryExpenses;
    protected Transaction[] transactions = new Transaction[20];
    protected int tCount = 0;

    // Constructor
    public Budget(double income, String[] categories, double[] categoryLimits) {
        this.income = income;
        this.categories = categories;
        this.categoryLimits = categoryLimits;
        this.categoryExpenses = new double[categories.length];
    }

    // Method to Add expense 
    public void addExpense(Transaction t) {

        if (!t.getType().equalsIgnoreCase("expense")) {
            return;
        }

        transactions[tCount++] = t;   // storing transaction
        totalExpenses += t.getAmount();

        for (int i = 0; i < categories.length; i++) {
            if (categories[i].equalsIgnoreCase(t.getCategory())) {
                categoryExpenses[i] += t.getAmount();
            }
        }
    }

    // Method for calculating net savings
    public double calculateSavings() {
        return income - totalExpenses;
    }

    @Override
    public void generateReport() {
        System.out.println("Generic Budget Report");
    }

    @Override
    public void detectOverspend() {
        for (int i = 0; i < categories.length; i++) {
            if (categoryExpenses[i] > categoryLimits[i]) {
                System.out.println("Overspending in " + categories[i]);
            }
        }
    }
}
