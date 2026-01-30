package com.lambdaexpression.bankingfinance;

import java.util.ArrayList;
import java.util.List;

public class DisplayAccountDetail {
	public static void main(String[] args) {
		List<BankAccount> accountDetail = new ArrayList<>();
		accountDetail.add(new BankAccount("Anjali" , "PNB", 1253, 28900));
		accountDetail.add(new BankAccount("Arpita" , "SBI", 1200, 35900));
		accountDetail.add(new BankAccount("Ananya" , "ICCI", 1190, 60500));
		accountDetail.add(new BankAccount("Himanshu" , "PNB", 1030, 38500));
		
		accountDetail.forEach(a -> System.out.println(a.toString()));
	}

}
