package com.functionalinterface.predicate.ecommerce;
/*
 * 4.In an e-commerce app, check if order amount is eligible for free delivery.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FreeDeliver {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Cetaphil Moisturizer" , 12, 869));
		products.add(new Product("Dresses" , 90, 1879));
		products.add(new Product("Jeans" , 11, 2100));
		products.add(new Product("Laptop" , 121, 54000));
		
		Predicate<Product> checkAmount = p -> p.orderAmount > 1799;
		
		products.forEach(p->{
			if(checkAmount.test(p)) {
				System.out.println(p.productName + " is Eligible for Free Delivery");
			}
			else {
				System.out.println(p.productName +" is NOT Eligible for Free Delivery");
			}
		});
	}

}
