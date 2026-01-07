package com.loanbuddy;

public class AutoLoan extends LoanApplication {

	// Constructor to create AutoLoan object
    public AutoLoan(Applicant applicant, int term) {
    	
    	// Call parent constructor with interest rate
        super(applicant, term, 10.5);
    }

    
    // Method to approve auto loan
    @Override
    public void approveLoan() {
    	
    	// Check basic eligibility
        if (basicEligibility()) {
            setApproved(true);
        }
    }

    // Calculate EMI for auto loan
    @Override
    public double calculateEMI() {
    	
    	// Auto loan has higher interest
        return emiFormula(interestRate + 1); // higher risk
    }
}
