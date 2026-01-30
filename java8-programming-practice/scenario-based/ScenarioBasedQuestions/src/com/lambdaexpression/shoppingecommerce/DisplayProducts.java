package com.lambdaexpression.shoppingecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DisplayProducts {
	public static void main(String[] args) {
		List<ECommerce> products = new ArrayList<>();
		products.add(new ECommerce("Shoes" , 1200));
		products.add(new ECommerce("Bag" , 900));
		products.add(new ECommerce("Dress" , 2400));
		products.add(new ECommerce("Cap" , 300));
		
		Consumer<ECommerce> printProductName =
                p -> System.out.println(p.productName);

        System.out.println("\nProduct Names:");
        products.forEach(printProductName);
	}

}
