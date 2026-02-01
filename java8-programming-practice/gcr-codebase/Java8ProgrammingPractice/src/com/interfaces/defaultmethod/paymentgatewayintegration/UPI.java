package com.interfaces.defaultmethod.paymentgatewayintegration;

public class UPI implements PaymentProcessor {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid INR " + amount + " using UPI");
	}

}
