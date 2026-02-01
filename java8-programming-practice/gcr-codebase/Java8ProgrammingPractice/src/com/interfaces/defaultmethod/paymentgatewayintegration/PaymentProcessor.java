package com.interfaces.defaultmethod.paymentgatewayintegration;

public interface PaymentProcessor {

	// Every payment provider must implement this
	void pay(double amount);

	// Default method for refund, can be used by all providers
	default void refund(double amount) {
		System.out.println("Refund of INR " + amount + " is processed by default method.");
	}

}
