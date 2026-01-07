package com.loanbuddy;

public abstract class LoanApplication implements IApprovable {

	// Applicant who applied for the loan
    protected Applicant applicant;
    protected int term;                     //Loan duration in months        
    protected double interestRate;         // interest rate yearly
    private boolean approved = false;     // Loan approval status (hidden)

    // Constructor to set loan details
    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
    }

    // Set loan approval status
    protected void setApproved(boolean status) {
        this.approved = status;
    }

    // Check if loan is approved
    public boolean isApproved() {
        return approved;
    }

    // Check basic eligibility conditions
    protected boolean basicEligibility() {
        return applicant.getCreditScore() >= 650 && applicant.getIncome() >= 25000;
    }

    // EMI calculation formula
    protected double emiFormula(double rate) {
    	
    	// Principal amount
        double P = applicant.getLoanAmount();
        
        // Monthly interest rate
        double R = rate / (12 * 100);
        int N = term;   // Number of months
        
        return (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);
    }

    
    // Show final loan result
    public void showResult() {
        if (approved) {
            System.out.println("Loan Status  : APPROVED");
            System.out.printf("Monthly EMI  : INR%.2f\n", calculateEMI());
        } else {
            System.out.println("Loan Status  : REJECTED");
        }
    }
}

