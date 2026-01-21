package com.generics.dynamiconlinemarketplace;

import java.util.Scanner;

public class UseOnlineMarketplace {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n===================================================");
        System.out.println("            Dynamic Online MarketPlace               ");
        System.out.println("===================================================\n");
        System.out.print("Enter number of products: ");
        int n = input.nextInt();
        input.nextLine();

        Product<?>[] catalog = new Product[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nProduct " + (i + 1));
            System.out.println("1. Book");
            System.out.println("2. Clothing");
            System.out.println("3. Gadget");
            System.out.print("Choose category: ");
            int choice = input.nextInt();
            input.nextLine();

            System.out.print("Enter product name: ");
            String name = input.nextLine();

            System.out.print("Enter price: ");
            double price = input.nextDouble();
            input.nextLine();

            switch (choice) {
                case 1:
                    catalog[i] = new Product<>(name, price, new BookCategory());
                    break;
                case 2:
                    catalog[i] = new Product<>(name, price, new ClothingCategory());
                    break;
                case 3:
                    catalog[i] = new Product<>(name, price, new GadgetCategory());
                    break;
                default:
                    System.out.println("Invalid choice!");
                    i--;
            }
        }

        // Apply discount
        System.out.print("\nEnter discount percentage: ");
        double discount = input.nextDouble();

        for (Product<?> product : catalog) {
            DiscountUtility.applyDiscount(product, discount);
        }

        // Display catalog
        System.out.println("\n-----------------------------------------------");
        System.out.println("                  Product Catalog                ");
        System.out.println("-----------------------------------------------\n");
        for (Product<?> product : catalog) {
            product.displayInfo();
        }

        input.close();
    }
}

