package com.interfaces.basic.digitalpayment;

public class UPI implements Payment {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid INR " + amount + " using UPI");
	}

}
