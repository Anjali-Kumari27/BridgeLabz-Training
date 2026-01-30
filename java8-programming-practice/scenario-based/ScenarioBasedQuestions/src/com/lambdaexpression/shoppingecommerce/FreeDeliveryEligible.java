package com.lambdaexpression.shoppingecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FreeDeliveryEligible {
	public static void main(String[] args) {
		List<ECommerce> products = new ArrayList<>();
		products.add(new ECommerce("Shoes" , 1200));
		products.add(new ECommerce("Bag" , 900));
		products.add(new ECommerce("Dress" , 2400));
		products.add(new ECommerce("Cap" , 300));
		
		Predicate<ECommerce> freeDelivery =
                p -> p.price > 500;

        System.out.println("\n================================================================");
        System.out.println("                       Free delivery eligibility                  ");
        System.out.println("================================================================\n");
        products.forEach(p -> {
            if (freeDelivery.test(p)) {
                System.out.println(p.productName + " : Free Delivery");
            } else {
                System.out.println(p.productName + " : Delivery Charges Applied");
            }
        });
	}

}
