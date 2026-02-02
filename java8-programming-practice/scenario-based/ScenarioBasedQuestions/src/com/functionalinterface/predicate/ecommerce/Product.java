package com.functionalinterface.predicate.ecommerce;

public class Product {

	String productName;
	int orderID;
	double orderAmount;
	
	public Product(String productName, int orderID, double orderAmount) {
		this.productName = productName;
		this.orderID = orderID;
		this.orderAmount = orderAmount;
	}
}
