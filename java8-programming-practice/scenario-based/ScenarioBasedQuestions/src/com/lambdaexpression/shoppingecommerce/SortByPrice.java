package com.lambdaexpression.shoppingecommerce;

import java.util.ArrayList;
import java.util.List;

public class SortByPrice {
	public static void main(String[] args) {
		List<ECommerce> products = new ArrayList<>();
		products.add(new ECommerce("Shoes" , 1200));
		products.add(new ECommerce("Bag" , 900));
		products.add(new ECommerce("Dress" , 2400));
		products.add(new ECommerce("Cap" , 300));
		
		products.sort(
                (p1, p2) -> Double.compare(p1.price, p2.price)
        );
		
		System.out.println("\n=================================================================");
		System.out.println("                     Products sorted by price                      ");
		System.out.println("=================================================================\n");
		products.forEach(p ->
        System.out.println(p.productName + " : INR " + p.price)
);
	}

}
