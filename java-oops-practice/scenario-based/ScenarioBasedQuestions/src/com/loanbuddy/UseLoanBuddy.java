package com.loanbuddy;

/*"LoanBuddy – Loan Approval Automation"
Story: A fintech startup named FinlyTech is launching a product called LoanBuddy, a web and
mobile app that automates personal loan approvals for salaried and self-employed applicants.
LoanBuddy should collect applicant data, verify eligibility, evaluate credit risk, and either
approve or reject the loan based on custom rules. It also calculates monthly EMIs and provides
a personalized repayment plan.
You’re hired as a Java backend developer to design and implement the core loan approval
engine.
Requirements:
● Applicant class: name, creditScore, income, loanAmount.
● LoanApplication class with loan type, term, and interest rate.
● Interface IApprovable with approveLoan() and calculateEMI().
● Use constructors to support different types of loans (personal, home, auto).
● Operators for EMI calculation: P × R × (1+R)^N / ((1+R)^N – 1)
● Encapsulation: keep credit score and internal approval logic private.
● Inheritance: different loan types (HomeLoan, AutoLoan) extending base class.
● Polymorphism: EMI calculation logic varies by loan type.
● Access modifiers to limit loan status changes to internal processes only.
*/


import java.util.Scanner;

public class UseLoanBuddy {

    public static void main(String[] args) {

    	// Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        System.out.println("\n===== Welcome to LoanBuddy =====\n");

        System.out.print("Enter Applicant Name: ");
        String name = input.nextLine();

        System.out.print("Enter Credit Score: ");
        int score = input.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = input.nextDouble();

        System.out.print("Enter Loan Amount: ");
        double amount = input.nextDouble();

        // Create Applicant object
        Applicant applicant = new Applicant(name, score, income, amount);

        // Ask user to select loan type
        System.out.println("\n--------- Select Loan Type ----------");
        System.out.println("1. Home Loan");
        System.out.println("2. Auto Loan");
        System.out.print("\nChoice: ");
        int choice = input.nextInt();

        // Take loan term in months
        System.out.print("Enter Loan Term (months): ");
        int term = input.nextInt();

        // Create LoanApplication reference
        LoanApplication loan;

        // Create loan object based on user choice
        if (choice == 1) {
            loan = new HomeLoan(applicant, term);
        } else {
            loan = new AutoLoan(applicant, term);
        }

        // Process loan approval
        System.out.println("\nProcessing Loan Application...");
        loan.approveLoan();

        System.out.println("\n\n===== Loan Summary =====\n");
        System.out.println("Applicant Name: " + applicant.getName());
        System.out.println("Loan Amount  : INR " + applicant.getLoanAmount());
        loan.showResult();

        System.out.println("\nThank you for using LoanBuddy!!!");
        input.close();
    }
}
