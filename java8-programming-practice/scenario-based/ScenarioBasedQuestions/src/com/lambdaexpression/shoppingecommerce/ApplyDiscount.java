package com.lambdaexpression.shoppingecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ApplyDiscount {
	public static void main(String[] args) {
		List<ECommerce> products = new ArrayList<>();
		products.add(new ECommerce("Shoes" , 1200));
		products.add(new ECommerce("Bag" , 900));
		products.add(new ECommerce("Dress" , 2400));
		products.add(new ECommerce("Cap" , 300));
		
		Function<Double, Double> applyDiscount =
                price -> price - (price * 0.10);

        System.out.println("\n======================================================================");
        System.out.println("                          Prices after 10% discount                     ");
        System.out.println("======================================================================\n");
        products.forEach(p ->
                System.out.println(p.productName + " : INR " + applyDiscount.apply(p.price))
        );
	}

}
