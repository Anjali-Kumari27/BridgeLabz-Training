package com.callcenter;

import java.util.Scanner;

public class UseCallCenter {

 public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     CallCenterManager center = new CallCenterManager();
     int choice;

     do {
    	 System.out.println("\n=========================================================");
         System.out.println("                     Call Center Menu                     ");
         System.out.println("=========================================================\n");
         System.out.println("1. Add Call");
         System.out.println("2. Handle Call");
         System.out.println("3. Show Call History");
         System.out.println("4. Exit");
         System.out.print("Enter choice: ");

         choice = input.nextInt();
         input.nextLine(); // clear buffer

         switch (choice) {

             case 1:
                 System.out.print("Enter customer name: ");
                 String name = input.nextLine();
                 System.out.print("Is VIP? (true/false): ");
                 boolean vip = input.nextBoolean();
                 center.addCall(name, vip);
                 break;

             case 2:
                 center.handleCall();
                 break;

             case 3:
                 center.showCallHistory();
                 break;

             case 4:
                 System.out.println("\n*************************");
                 System.out.println("       System Closed      ");
                 System.out.println("*************************\n");
                 break;

             default:
                 System.out.println("Invalid choice.");
         }

     } while (choice != 4);

     input.close();
 }
}
