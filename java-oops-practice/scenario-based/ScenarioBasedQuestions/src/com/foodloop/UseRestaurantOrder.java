package com.foodloop;

/*"FoodLoop – Restaurant Ordering System"
Story: FoodLoop is an app where users place food orders from local restaurants.
Requirements:
● FoodItem class: name, category, price, availability.
● Order class: contains list of food items and total.
● Interface IOrderable with placeOrder() and cancelOrder().
● Use constructors to create custom combo meals.
● Operators: total price = sum of item prices – discounts.
● Encapsulation: keep item stock levels hidden.
● Inheritance: VegItem, NonVegItem extend FoodItem.
● Polymorphism: applyDiscount() varies by order total.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class UseRestaurantOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Order order = new Order();

        // Predefined Veg Menu
        ArrayList<FoodItem> vegMenu = new ArrayList<>();
        vegMenu.add(new VegItem("Paneer Burger", 150, 5));
        vegMenu.add(new VegItem("Veg Pizza", 250, 0));   // Out of stock
        vegMenu.add(new VegItem("Masala Dosa", 120, 4));
        vegMenu.add(new VegItem("Veg Combo (Veg Noodles + cold coffee)", 220, 2));
        vegMenu.add(new VegItem("Veg Combo (Cheese Sandwich + cold coffee)", 180, 1));

        // Predefined Non-Veg Menu
        ArrayList<FoodItem> nonVegMenu = new ArrayList<>();
        nonVegMenu.add(new NonVegItem("Chicken Burger", 180, 3));
        nonVegMenu.add(new NonVegItem("Chicken Pizza", 350, 2));
        nonVegMenu.add(new NonVegItem("Mutton Biryani", 544, 0)); // Out of stock
        nonVegMenu.add(new VegItem("NonVeg Combo (Chicken burger + cold drink)", 400, 1));

        System.out.println("\n==========================================================");
        System.out.println("                  Welcome to Our Restaurant                 ");
        System.out.println("===========================================================");
        
        while (true) {
        	System.out.println("\n----- Food Items available -----\n");
            
            System.out.println("1. Veg Menu");
            System.out.println("2. Non-Veg Menu");
            System.out.println("3. Place Order");
            System.out.println("4. Cancel Order");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n-----------------------------------------------------------------");
                    System.out.println("                               Veg Menu                            ");
                    System.out.println("------------------------------------------------------------------");
                    for (int i = 0; i < vegMenu.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        vegMenu.get(i).displayDetails();
                    }
                    System.out.print("\nSelect item number: ");
                    int vChoice = input.nextInt();
                    order.addItem(vegMenu.get(vChoice - 1));
                    break;

                case 2:
                	System.out.println("\n-------------------------------------------------------------------");
                    System.out.println("                           Non-Veg Menu                              ");
                    System.out.println("--------------------------------------------------------------------");
                    for (int i = 0; i < nonVegMenu.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        nonVegMenu.get(i).displayDetails();
                    }
                    System.out.print("\nSelect item number: ");
                    int nChoice = input.nextInt();
                    order.addItem(nonVegMenu.get(nChoice - 1));
                    break;

                case 3:
                    order.placeOrder();
                    break;
                    
                case 4:
                    order.cancelOrder();
                    break;

                case 5:
                    System.out.println("\nThank you for using FoodLoop!!!!");
                    return;

                default:
                    System.out.println("\nInvalid choice");
            }
        }
    }
}
