package com.trafficmanager;

/*
 * TrafficManager – Roundabout Vehicle Flow (Circular Linked List +
Queue)
Story: A smart city roundabout allows vehicles to enter and exit dynamically. Each vehicle is a
node in a Circular Linked List. A Queue manages vehicles waiting to enter.
Requirements:
● Add or remove cars in a circular path.
● Queue overflow/underflow handling.
● Print state of roundabout at any time.
 */

import java.util.Scanner;

public class UseTrafficManager {

 public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     TrafficManager manager = new TrafficManager();
     
     //setting size of queue as 5
     VehicleQueue queue = new VehicleQueue(5);

     int choice;

     do {
         System.out.println("\n=================================================");
         System.out.println("                Traffic Manager Menu               ");
         System.out.println("=================================================\n");
         System.out.println("1. Add Vehicle to Waiting Queue");
         System.out.println("2. Move Vehicle into Roundabout");
         System.out.println("3. Remove Vehicle from Roundabout");
         System.out.println("4. Show Roundabout State");
         System.out.println("5. Exit");
         System.out.print("Enter choice: ");

         choice = input.nextInt();
         input.nextLine();

         switch (choice) {

             case 1:
                 System.out.print("\nEnter vehicle number: ");
                 queue.enqueue(input.nextLine());
                 break;

             case 2:
                 if (!queue.isEmpty()) {
                     String v = queue.dequeue();
                     manager.enterRoundabout(v);
                 }
                 break;

             case 3:
                 System.out.print("\nEnter vehicle number to exit: ");
                 manager.exitRoundabout(input.nextLine());
                 break;

             case 4:
                 manager.displayRoundabout();
                 break;

             case 5:
            	 System.out.println("\n-------------------------------------------------------------");
                 System.out.println("            Thankyou for using Traffic System !!!              ");
                 System.out.println("-------------------------------------------------------------\n");
                 break;

             default:
                 System.out.println("----- Invalid choice -----");
         }

     } while (choice != 5);

     input.close();
 }
}

