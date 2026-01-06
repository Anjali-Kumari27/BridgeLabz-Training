package com.swiftcartgroceryshoppingapp;

/*SwiftCart – The Grocery Shopping App"
Story: You're building SwiftCart, an online grocery platform where users add items to cart and
check out. The backend logic for cart management is your task.
Requirements:
● Product class: name, price, category.
● Cart class: holds a list of products and totalPrice.
● Constructors allow cart creation with or without pre-selected items.
● ICheckout interface with generateBill() and applyDiscount().
● Use encapsulation to protect price calculations.
● Operators for total: price * quantity, discount: totalPrice - coupon.
● Inheritance: different product types like PerishableProduct,
NonPerishableProduct.
● Use polymorphism in discount application (e.g., discount varies by product type).
● Apply access modifiers so only Cart can update prices.
*/



import java.util.Scanner;

public class UseSwiftCart {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.println("===== Welcome to SwiftCart =====");

        boolean runApp = true;

        while (runApp) {

            System.out.println("\nSelect Option:");
            System.out.println("1. Add Perishable Product");
            System.out.println("2. Add Non-Perishable Product");
            System.out.println("3. Apply Discount Coupon");
            System.out.println("4. Generate Bill & Exit");
            System.out.print("Choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                case 2:
                    System.out.print("\nEnter Product Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Category: ");
                    String category = input.nextLine();

                    System.out.print("Enter Price: ");
                    double price = input.nextDouble();

                    //System.out.print("-------------------------\n ");
                    System.out.print("Enter Quantity: ");
                    int qty = input.nextInt();
                    System.out.print("-------------------------\n ");
                    input.nextLine();

                    Product product;
                    if (choice == 1) {
                        product = new PerishableProduct(name, price, category);
                    } else {
                        product = new NonPerishableProduct(name, price, category);
                    }

                    cart.addProduct(product, qty);
                    break;

                case 3:
                    System.out.print("\nEnter Coupon Amount: ");
                    double coupon = input.nextDouble();
                    input.nextLine();
                    cart.applyDiscount(coupon);
                    break;

                case 4:
                    cart.generateBill();
                    runApp = false;
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

        System.out.println("\nThank you for shopping at SwiftCart!");
        input.close();
    }
}
