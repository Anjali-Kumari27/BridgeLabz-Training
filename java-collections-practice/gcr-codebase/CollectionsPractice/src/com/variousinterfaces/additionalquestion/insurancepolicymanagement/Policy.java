package com.variousinterfaces.additionalquestion.insurancepolicymanagement;

import java.time.LocalDate;

public class Policy {

    int policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    // Constructor
    public Policy(int policyNumber, String holderName,
                  LocalDate expiryDate, String coverageType,
                  double premium) {

        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    // Display policy details
    public String toString() {
        return policyNumber + " | " + holderName + " | " +
               expiryDate + " | " + coverageType + " | " + premium;
    }
}
