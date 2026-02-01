package com.interfaces.basic.digitalpayment;

public class CreditCard implements Payment {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid INR " + amount + " using Credit Card");
	}

}
