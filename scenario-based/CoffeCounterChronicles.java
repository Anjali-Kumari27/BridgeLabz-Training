/* Problem 1: The Coffee Counter Chronicles

Ravi runs a café where customers order different types of coffee with specific quantities.

Write a Java program that asks the user for the coffee type using switch, accepts quantity, 
calculates the total bill using price multiplied by quantity, adds GST using arithmetic operators, 
and continues serving customers using a while loop. The program should stop when the user types “exit”. */







import java.util.Scanner;

// Coffee Counter Program Stores each order and prints the bill

public class CoffeCounterChronicles {

    // Method to calculate total price including GST
    public static double totalPrice(double quantity, double price, double gst) {

        double subTotal = quantity * price;
        double gstAmount = (gst / 100) * subTotal;

        return subTotal + gstAmount;
    }




    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // GST percentage
        double gst = 2.5;

        // To store final total bill
        double grandTotal = 0.0;

        // To store item-wise bill details
        String finalBillDetails = "";

        System.out.println("Welcome to Ravi's Coffee Cafe");

        // Loop for multiple orders
        while (true) {

            System.out.println("\n----------------- Menu -----------------");
            System.out.println("Type 'exit' to stop ordering");
            System.out.println("Latte");
            System.out.println("Espresso");
            System.out.println("Cappuccino");
            System.out.println("Cold Coffee");
            System.out.println("Cold Coffee with Ice-cream");
            System.out.println("Hot Coffee");
            System.out.println("Americano");
            System.out.print("Enter your choice: ");

            String typeOfCoffee = input.nextLine();

            // Exit condition
            if (typeOfCoffee.equalsIgnoreCase("exit")) {
                break;
            }

            double price = 0.0;

            // Coffee price selection
            switch (typeOfCoffee.toLowerCase()) {

                case "latte":
                    price = 135.5;
                    break;

                case "espresso":
                    price = 120.0;
                    break;

                case "cappuccino":
                    price = 160.0;
                    break;

                case "cold coffee":
                    price = 150.0;
                    break;

                case "cold coffee with ice-cream":
                    price = 180.0;
                    break;

                case "hot coffee":
                    price = 100.0;
                    break;

                case "americano":
                    price = 140.0;
                    break;

                default:
                    System.out.println("Invalid coffee type... Please try again.");
                    continue;
            }

            // Quantity input
            System.out.print("Enter quantity: ");
            double quantity = input.nextDouble();
            input.nextLine(); // clear buffer

            if (quantity <= 0) {
                System.out.println("Invalid quantity.");
                continue;
            }

            // Calculate item bill
            double itemBill = totalPrice(quantity, price, gst);

            // Add to grand total
            grandTotal += itemBill;

            // Store item-wise bill for final printing
            finalBillDetails += typeOfCoffee + " * " + quantity + "  = INR " + itemBill + "\n";
        }

        // Print final bill after exit
        System.out.println("\n=========== FINAL BILL ===========");
        System.out.print(finalBillDetails);
        System.out.println("---------------------------------");
        System.out.println("Total Bill = INR "    + grandTotal);
        System.out.println("Thank you for visiting the cafe!!!");

        input.close();
    }
}
