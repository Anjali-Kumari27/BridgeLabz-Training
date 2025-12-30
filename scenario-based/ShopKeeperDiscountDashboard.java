/*Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/

import java.util.Scanner;

public class ShopKeeperDiscountDashboard {

       //method to calculate discount amount
       public static double Discount(double totalBill ){

              //Discount percentages (constants)
              final double discount20 = 20.0;
              final double discount45 = 45.0;
 
              //variable to store calculated discount amount
              double discountPrice = 0.0;

              //if total bill is greater then or equals to 2159 give 45% discount
              if(totalBill >= 2159 ){

                 discountPrice = (discount45 / 100 ) * totalBill;
           
              }
              
              //if totalBill is greater than equals to 1999 then give 20% discount
              else if(totalBill >= 1999){
            
                  discountPrice = (discount20 / 100 ) * totalBill;
              
              }

              //return discount amount
              return discountPrice;


       }



       //main method
       public static void main (String[]  args){
              
              //Scanner object to take input from user
              Scanner input = new Scanner(System.in);

              //taking number of items from user
              System.out.print("Enter number of items purchased : ");
              int n = input.nextInt();
   
              //variable to store total bill amount
              double totalBill = 0.0;

              //loop to take price of each item
              for (int i = 0 ; i < n ; i++){

                   System.out.print("Enter the price of item " + (i+1) + ": ");
                   double price = input.nextDouble();

                   //Adding item price to total bill
                   totalBill += price;
              }

              //calling Discount method to get discount amount
              double discountAmount = Discount(totalBill);

              //Displaying bill in tabular format
              System.out.println("\n================ BILL SUMMARY ================");
              System.out.println("----------------------------------------------");
              System.out.printf("%-25s : %d\n", "Number of Items", n);
              System.out.printf("%-25s : INR %.2f\n", "Total Bill", totalBill);
              System.out.printf("%-25s : INR %.2f\n", "Discount Amount", discountAmount);
              System.out.println("----------------------------------------------");
              System.out.printf("%-25s : INR %.2f\n", "Final Bill to Pay", (totalBill - discountAmount));
              System.out.println("==============================================");
               
              
              input.close();

       }

}