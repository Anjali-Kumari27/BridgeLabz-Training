package com.payxpress;

import java.time.LocalDate;

public class InternetBill extends Bill{

	public InternetBill(double amount, LocalDate dueDate) {
		// TODO Auto-generated constructor stub
		super("InternetBill", amount, dueDate);
	}

	@Override
	public void sendReminder() {
		// TODO Auto-generated method stub
		System.out.println("REMAINDER : Internet Bill is not paid !!! Pay to avoid Internet Speed issue");
	}

}
