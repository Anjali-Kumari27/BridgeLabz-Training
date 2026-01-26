package com.reflection.proxylogging;

//implementation of Greeting
public class GreetingImplement implements Greeting {

	// Overridden Parent's method
	@Override
	public void sayHello() {
		System.out.println("Hello, World!");
	}
}
