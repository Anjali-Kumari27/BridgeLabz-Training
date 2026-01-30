package com.lambdaexpression.customsortingecommerce;
/*
 * Custom Sorting in E-Commerce
○ Scenario: An online shop wants to sort products differently based on sales
campaigns (by price, rating, discount).
○ Task: Use a lambda with Comparator to sort products dynamically.
 */
import java.util.ArrayList;
import java.util.List;

public class ECommerce {

    public static class Product {
        String name;
        double price;
        double rating;
        double discount;

        Product(String name, double price, double rating, double discount) {
            this.name = name;
            this.price = price;
            this.rating = rating;
            this.discount = discount;
        }

        public String toString() {
            return name + " | Price: " + price +
                   " | Rating: " + rating +
                   " | Discount: " + discount + "%";
        }
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 60000, 4.5, 15));
        products.add(new Product("Mobile", 30000, 4.7, 10));
        products.add(new Product("Headphones", 2000, 4.2, 25));
        products.add(new Product("Smart Watch", 8000, 4.0, 20));

        //Sort by Price (Low to High)
        products.sort((p1, p2) -> {
            return Double.compare(p1.price, p2.price);
        });

        System.out.println("\n===========================================================================");
        System.out.println("                          Sorted by Price:                                   ");
        System.out.println("===========================================================================\n");
        for (Product p : products) {
            System.out.println(p);
        }

        //Sort by Rating (High to Low)
        products.sort((p1, p2) -> {
            return Double.compare(p2.rating, p1.rating);
        });

        System.out.println("\n===========================================================================");
        System.out.println("                           Sorted by Rating:                                 ");
        System.out.println("===========================================================================\n");
        for (Product p : products) {
            System.out.println(p);
        }

        //Sort by Discount (High to Low)
        products.sort((p1, p2) -> {
            return Double.compare(p2.discount, p1.discount);
        });

        System.out.println("\n===========================================================================");
        System.out.println("                           Sorted by Discount:                               ");
        System.out.println("===========================================================================\n");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
