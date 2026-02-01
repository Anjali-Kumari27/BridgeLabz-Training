package com.interfaces.defaultmethod.paymentgatewayintegration;

public class CreditCard implements PaymentProcessor {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid INR " + amount + " using Credit Card");
	}

}
