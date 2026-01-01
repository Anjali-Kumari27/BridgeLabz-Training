/* Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while). */




import java.util.Scanner;

public class CurrencyExchangeKiosk {

    // method for currency conversion
    public void convertCurrency(double inrAmount, int choice) {

        double convertedAmount;

        switch (choice) {

            // USD
            case 1: 
                convertedAmount = inrAmount * 0.012;
                System.out.println("Converted Amount: $" + convertedAmount);
                break;

            // EUR
            case 2: 
                convertedAmount = inrAmount * 0.011;
                System.out.println("Converted Amount: " + convertedAmount + " euro");
                break;

            // GBP
            case 3: 
                convertedAmount = inrAmount * 0.0095;
                System.out.println("Converted Amount: £" + convertedAmount);
                break;

            // JPY
            case 4: 
                convertedAmount = inrAmount * 1.77;
                System.out.println("Converted Amount: ¥" + convertedAmount);
                break;

            default:
                System.out.println("Invalid currency choice");

        }
    }



    //main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CurrencyExchangeKiosk kiosk = new CurrencyExchangeKiosk();

        System.out.println("              ");
        System.out.println("******************************************************");
        System.out.print("            Currency Coverter        ");
        System.out.print("\n******************************************************\n");


        char repeat;

        // do-while loop for multiple conversions
        do {

            System.out.print("Enter amount in INR: ");
            double inrAmount = input.nextDouble();

            System.out.println("Choose target currency:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");
            System.out.println("4. JPY");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();


            // Calling method using object
            kiosk.convertCurrency(inrAmount, choice);

            System.out.print("Do you want another conversion? (y/n): ");
            repeat = input.next().charAt(0);

            System.out.println("--------------------------------");

        } 
        while (repeat == 'y' || repeat == 'Y');


        System.out.println("Thank you for using Currency Exchange Kiosk");

        input.close();

    }
}
