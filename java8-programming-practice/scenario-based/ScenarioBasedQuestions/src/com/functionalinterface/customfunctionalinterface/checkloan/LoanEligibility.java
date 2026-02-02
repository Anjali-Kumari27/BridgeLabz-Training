package com.functionalinterface.customfunctionalinterface.checkloan;
/*
 * 2.Create a custom functional interface to check loan eligibility.
 */
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface CheckLoanEligibility {
    boolean isEligible(double salary, int creditScore);
}


public class LoanEligibility {
    public static void main(String[] args) {

        List<Applicant> applicants = new ArrayList<>();
        applicants.add(new Applicant("Anjali", 40000, 750));
        applicants.add(new Applicant("Ananya", 25000, 680));
        applicants.add(new Applicant("Devika", 35000, 720));
        applicants.add(new Applicant("Shreya", 20000, 650));

        // Custom functional interface using lambda
        CheckLoanEligibility loanCheck = (salary, creditScore) -> {
            return salary >= 30000 && creditScore >= 700;
        };

        applicants.forEach(a -> {
            if (loanCheck.isEligible(a.salary, a.creditScore)) {
                System.out.println(a.name + " -> Loan Approved ");
            } else {
                System.out.println(a.name + " -> Loan Rejected ");
            }
        });
    }
}

