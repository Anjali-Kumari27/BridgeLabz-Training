package com.artify;

/*"Artify – Digital Art Marketplace"
Story: Artists sell digital art via Artify. Buyers can purchase, license, or subscribe to collections.
Requirements:
● Artwork class: title, artist, price, licenseType.
● User class: name, walletBalance.
● Interface IPurchasable with purchase() and license() methods.
● Encapsulation: licensing terms are protected.
● Use constructors to initialize artworks with or without previews.
● Operators: deduct wallet balance on purchase.
● Inheritance: DigitalArt, PrintArt from Artwork.
● Polymorphism: licensing varies across art types.
*/


import java.util.ArrayList;
import java.util.Scanner;

public class UseDigitalArt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // USER INPUT
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter wallet balance: ");
        double balance = input.nextDouble();

        User user = new User(name, balance);

        // DIGITAL ART LIST
        ArrayList<Artwork> digitalArts = new ArrayList<>();
        digitalArts.add(new DigitalArt("Sunset Bliss", "Aarav", 8900));
        digitalArts.add(new DigitalArt("Ocean Waves", "Meera", 4500));
        digitalArts.add(new DigitalArt("Temple City", "M Singh", 80000));
        digitalArts.add(new DigitalArt("Varansi Ghat", "Soumen Saha", 45090));
        digitalArts.add(new DigitalArt("Tranquility", "Kayalvizhi Sethukarasu", 70050));
        digitalArts.add(new DigitalArt("Maha Laxmi", "Chandra Morkonda", 100500));

        // PRINT ART LIST
        ArrayList<Artwork> printArts = new ArrayList<>();
        printArts.add(new PrintArt("Mountain Dreams", "Riya", 5000));
        printArts.add(new PrintArt("Tree Series", "Bhaskar Rao B", 35000));
        printArts.add(new PrintArt("Praiseful Nature", "Ganpati Hegde", 12250));
        printArts.add(new PrintArt("Bith of Brahma", "Arti Vohra", 85050));
        printArts.add(new PrintArt("Battle Of Mahabharta", "Chetan Katigar", 95000));
        printArts.add(new PrintArt("Hanuman", "Ganpati Hegde", 718000));

        while (true) {
        	System.out.println("\n===============================================================================");
            System.out.println("                           Welcome to Artify Gallery                             ");
            System.out.println("=================================================================================\n");
            user.displayUser();

            System.out.println("\n1. View Digital Art");
            System.out.println("2. View Print Art");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.println("\n-------------------------------------------------------");
                    System.out.println("              Digital Art Collection             ");
                    System.out.println("---------------------------------------------------------\n");
                    for (int i = 0; i < digitalArts.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        digitalArts.get(i).displayDetails();
                    }

                    System.out.print("\nSelect artwork number: ");
                    int dChoice = input.nextInt();
                    input.nextLine();

                    Artwork dArt = digitalArts.get(dChoice - 1);

                    System.out.print("Do you want to purchase this artwork? (yes/no): ");
                    String dConfirm = input.nextLine();

                    if (dConfirm.equalsIgnoreCase("yes")) {
                        System.out.print("Select License Type (Personal / Commercial): ");
                        String dLicense = input.nextLine();

                        dArt.setSelectedLicense(dLicense);
                        dArt.purchase(user);
                        dArt.license();
                    } else {
                        System.out.println("\nPurchase cancelled by user.");
                    }
                    break;

                case 2:
                	System.out.println("\n---------------------------------------------------");
                    System.out.println("               Print Art Collection                 ");
                    System.out.println("-----------------------------------------------------\n");
                    for (int i = 0; i < printArts.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        printArts.get(i).displayDetails();
                    }

                    System.out.print("\nSelect artwork number: ");
                    int pChoice = input.nextInt();
                    input.nextLine();

                    Artwork pArt = printArts.get(pChoice - 1);

                    System.out.print("Do you want to purchase this artwork? (yes/no): ");
                    String pConfirm = input.nextLine();

                    if (pConfirm.equalsIgnoreCase("yes")) {
                        System.out.print("Select License Type (Single Print / Commercial Print): ");
                        String pLicense = input.nextLine();

                        pArt.setSelectedLicense(pLicense);
                        pArt.purchase(user);
                        pArt.license();
                    } else {
                        System.out.println("\nPurchase cancelled by user.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using Artify!");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
