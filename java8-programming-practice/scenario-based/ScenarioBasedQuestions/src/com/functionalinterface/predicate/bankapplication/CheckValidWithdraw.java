package com.functionalinterface.predicate.bankapplication;
/*
 * 3.In a bank application, validate whether withdrawal amount is valid using Predicate.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CheckValidWithdraw {
	public static void main(String[] args) {
		List<BankAccount> account = new ArrayList<>();
		account.add(new BankAccount("Anjali", 1234, 6500));
		account.add(new BankAccount("Arpita", 1190, 2300));
		account.add(new BankAccount("Aarya", 1345, 1000));
		account.add(new BankAccount("Anshi", 1890, 700));
		account.add(new BankAccount("Ananya", 1123, 5000));
		
		double withdrawAmount = 1250.5;
		
		Predicate<BankAccount> checkValid = b -> b.balance >= withdrawAmount;
		
		account.forEach(b->{
			if(checkValid.test(b)) {
				System.out.println(b.accHolder +" have enough or valid money to withdraw");
			}else {
				System.out.println(b.accHolder +" have NOT enough or valid money to withdraw...");
			}
		});
	}

}
