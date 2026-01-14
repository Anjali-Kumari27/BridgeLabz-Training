package com.payxpress;

import java.time.LocalDate;

public class ElectricityBill extends Bill{

	public ElectricityBill(double amount, LocalDate dueDate) {
		// TODO Auto-generated constructor stub
		super("Electricity", amount, dueDate);
	}

	@Override
	public void sendReminder() {
		// TODO Auto-generated method stub
		System.out.println("REMAINDER : Electricity Bill is not paid !!!! Pay to avoid power cut");
	}

}
