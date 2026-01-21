package com.generics.smartwarehousesystem;

import java.util.Scanner;

public class UseSmartWarehouseSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        System.out.println("\n==================================================");
        System.out.println("             Smart Warehouse System                 ");
        System.out.println("====================================================");
        System.out.print("Enter number of items to add: ");
        int n = input.nextInt();
        input.nextLine(); 

        for (int i = 1; i <= n; i++) {

            System.out.println("\nItem " + i);
            System.out.println("1. Electronics");
            System.out.println("2. Groceries");
            System.out.println("3. Furniture");
            System.out.print("Choose item type: ");
            int choice = input.nextInt();
            input.nextLine();

            System.out.print("Enter item name: ");
            String name = input.nextLine();

            switch (choice) {
                case 1:
                    electronicsStorage.addItem(new Electronics(name));
                    break;

                case 2:
                    groceriesStorage.addItem(new Groceries(name));
                    break;

                case 3:
                    furnitureStorage.addItem(new Furniture(name));
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        // Display all items
        System.out.println("\n-------------------------");
        System.out.println("       Electronics         ");
        System.out.println("-------------------------\n");
        WarehouseUtility.displayAllItems(electronicsStorage.getItems());

        System.out.println("\n-------------------------");
        System.out.println("         Groceries         ");
        System.out.println("-------------------------\n");
        WarehouseUtility.displayAllItems(groceriesStorage.getItems());

        System.out.println("\n-------------------------");
        System.out.println("         Furniture         ");
        System.out.println("-------------------------\n");
        WarehouseUtility.displayAllItems(furnitureStorage.getItems());

        input.close();
    }
}

