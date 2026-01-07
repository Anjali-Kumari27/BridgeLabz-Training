package com.loanbuddy;

public class HomeLoan extends LoanApplication {

	// Constructor to create HomeLoan object
    public HomeLoan(Applicant applicant, int term) {
    	
    	// Call parent constructor with interest rate
        super(applicant, term, 8.5);
    }

    // Method to approve home loan
    @Override
    public void approveLoan() {
    	
    	// Check basic eligibility and minimum income
        if (basicEligibility() && applicant.getIncome() >= 40000) {
        	
        	// Approve the loan
            setApproved(true);
        }
    }

    // Calculate EMI for home loan
    @Override
    public double calculateEMI() {
    	
    	// Home loan has normal interest rate
        return emiFormula(interestRate);
    }
}

