package com.lambdaexpression.shoppingecommerce;

/*
 * Scenario 3: Shopping / E-Commerce

1.Use lambda to apply 10% discount on product price.

2.Sort products by price using lambda.

3.Use lambda to check free delivery eligibility (amount > 500).

4.Use lambda to calculate final bill amount.

5.Use lambda to print product names.
 */
public class ECommerce {
	String productName;
	double price;
	
	ECommerce(String productName, double price){
		this.productName = productName;
        this.price = price;
	}

	@Override
	public String toString() {
		return "ECommerce Products { " +
	            "Product Name : '" + productName + '\'' +
	            ", Product Price : " + price +
	            '}';
	            
	 }
}
