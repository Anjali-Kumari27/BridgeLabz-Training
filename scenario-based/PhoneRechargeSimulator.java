/*
 Phone Recharge Simulator 📱
 - Takes mobile operator and recharge amount from user
 - Uses switch-case to show offers
 - Allows multiple recharges using loop
 - Shows balance after each recharge
*/


import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Stores total recharge balance
        double balance = 0.0;   
        boolean continueRecharge = true;

        System.out.println(" Welcome to Phone Recharge Simulator");

        // Loop to allow repeated recharges
        while (continueRecharge) {

            // Taking mobile operator from user
            System.out.println("\nEnter your mobile operator from the following : ");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. VI");
            System.out.print("");
            String operator = input.next();

            // Taking recharge amount
            System.out.print("\nEnter recharge amount : INR ");
            double amount = input.nextDouble();

            // Adding recharge amount to balance
            balance += amount;

            // Switch case to display offers
            switch (operator.toLowerCase()) {

                case "jio":
                    System.out.println("Offer: 2GB/day + Unlimited Calls");
                    break;

                case "airtel":
                    System.out.println("Offer: 1.5GB/day + Unlimited Calls");
                    break;

                case "vi":
                    System.out.println("Offer: 1GB/day + Weekend Data Rollover");
                    break;

                default:
                    System.out.println("No offers available for this operator");
            }

            // Showing updated balance
            System.out.println("Current Recharge Balance : INR " + balance);

            // Asking user if they want to recharge again
            System.out.print("Do you want to recharge again? (yes/no) : ");
            String choice = input.next();

            if (choice.equalsIgnoreCase("no")) {
                continueRecharge = false;
            }
        }

        System.out.println("\nThank you for using Phone Recharge Simulator ");
        input.close();
    }
}
