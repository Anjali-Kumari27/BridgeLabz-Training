package com.lambdaexpression.bankingfinance;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class WithdrawAmount {
	public static void main(String[] args) {
		List<BankAccount> accountDetail = new ArrayList<>();
		accountDetail.add(new BankAccount("Anjali" , "PNB", 1253, 28000));
		accountDetail.add(new BankAccount("Arpita" , "SBI", 1200, 3500));
		accountDetail.add(new BankAccount("Ananya" , "ICCI", 1190, 4070));
		accountDetail.add(new BankAccount("Himanshu" , "PNB", 1030, 5000));
		
		double withdrawAmount = 5000;
		
		BiPredicate<Double, Double> canWithdraw =
                (balance, amount) -> amount <= balance;

        accountDetail.forEach(a -> {
            if (canWithdraw.test(a.balance, withdrawAmount)) {
                System.out.println(a.accHolder +
                        " can withdraw INR " + withdrawAmount);
            } else {
                System.out.println(a.accHolder +
                        " cannot withdraw INR " + withdrawAmount +
                        " (Insufficient balance)");
            }
        });
	}

}
