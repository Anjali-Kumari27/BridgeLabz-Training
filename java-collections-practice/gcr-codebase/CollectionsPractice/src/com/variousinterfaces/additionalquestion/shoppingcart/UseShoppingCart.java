package com.variousinterfaces.additionalquestion.shoppingcart;

import java.util.Scanner;

public class UseShoppingCart {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CartManager cart = new CartManager();

        System.out.println("\n========================================");
        System.out.println("          Shopping Cart Management        ");
        System.out.println("========================================\n");
        System.out.print("Enter number of products: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter product name: ");
            String name = input.next();

            System.out.print("Enter product price: ");
            double price = input.nextDouble();

            cart.addProduct(name, price);
        }

        System.out.println();
        cart.showHashMapItems();

        System.out.println();
        cart.showLinkedHashMapItems();

        System.out.println();
        cart.showTreeMapItems();

        input.close();
    }
}

