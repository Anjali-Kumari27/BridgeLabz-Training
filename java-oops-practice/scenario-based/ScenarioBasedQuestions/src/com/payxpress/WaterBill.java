package com.payxpress;

import java.time.LocalDate;

public class WaterBill extends Bill{

	public WaterBill(double amount, LocalDate dueDate) {
		// TODO Auto-generated constructor stub
		super("WaterBill", amount, dueDate);
	}

	@Override
	public void sendReminder() {
		// TODO Auto-generated method stub
		System.out.println("REMAINDER : Water Bill is not paid !!! Pay to avoid uniterrupted supply");
	}

}
