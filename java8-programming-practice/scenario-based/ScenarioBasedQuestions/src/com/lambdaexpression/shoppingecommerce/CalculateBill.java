package com.lambdaexpression.shoppingecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class CalculateBill {

    public static void main(String[] args) {

        List<ECommerce> products = new ArrayList<>();

        products.add(new ECommerce("Shoes", 1200));
        products.add(new ECommerce("Bag", 900));
        products.add(new ECommerce("Dress", 2400));
        products.add(new ECommerce("Cap", 300));

        //Lambda for 10% discount
        Function<Double, Double> applyDiscount =
                price -> price - (price * 0.10);

        //Calculate final bill
        double finalBill =
                products.stream()
                        .map(p -> applyDiscount.apply(p.price))
                        .reduce(0.0, (a, b) -> a + b);

        System.out.println("\nFinal Bill Amount: INR " + finalBill);
    }
}
