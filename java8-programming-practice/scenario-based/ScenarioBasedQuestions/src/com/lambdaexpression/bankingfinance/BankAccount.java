package com.lambdaexpression.bankingfinance;

/*
 * Scenario 4: Banking / Finance

1.Use lambda to check minimum balance rule.

2.Use lambda to calculate simple interest.

3.Use lambda to validate withdrawal amount.

4.Use lambda to print account details.

5.Use lambda to compare two account balances.
 */
public class BankAccount {
	String accHolder;
	String bankName;
	int accNumber;
	double balance;
	
	BankAccount(String accHolder, String bankName,int accNumber, double balance){
		this.accHolder = accHolder;
		this.bankName = bankName;
		this.accNumber = accNumber;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "BankAccount { " +
	            "Account Holder : '" + accHolder + '\'' +
	            ", Bank Name : '" + bankName + '\'' +
	            ", Account Number : " + accNumber +
	            ", Balance : " + balance + 
	            '}';
		
	}
    
}
