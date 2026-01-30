package com.lambdaexpression.bankingfinance;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompareBalance {
	public static void main(String[] args) {
		List<BankAccount> accountDetail = new ArrayList<>();
		accountDetail.add(new BankAccount("Anjali", "PNB", 1253, 28900));
		accountDetail.add(new BankAccount("Arpita", "SBI", 1200, 35900));
		accountDetail.add(new BankAccount("Ananya", "ICCI", 1190, 60500));
		accountDetail.add(new BankAccount("Himanshu", "PNB", 1030, 38500));

		Comparator<BankAccount> compareBalance = (a1, a2) -> Double.compare(a1.balance, a2.balance);
		BankAccount acc1 = accountDetail.get(0);
        BankAccount acc2 = accountDetail.get(1);

        int result = compareBalance.compare(acc1, acc2);

        if (result > 0) {
            System.out.println(acc1.accHolder + " has MORE balance than " + acc2.accHolder);
        } else if (result < 0) {
            System.out.println(acc1.accHolder + " has LESS balance than " + acc2.accHolder);
        } else {
            System.out.println("Both have EQUAL balance");
        }
	}

}
