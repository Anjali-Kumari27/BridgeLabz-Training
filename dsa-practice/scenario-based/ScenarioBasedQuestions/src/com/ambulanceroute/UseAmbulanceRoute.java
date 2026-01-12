package com.ambulanceroute;

/*
 * AmbulanceRoute – Emergency Patient Navigation (Circular Linked List)
Story: In a hospital, there are multiple buildings connected in a circular fashion:
Emergency → Radiology → Surgery → ICU → Emergency. When an ambulance is bringing in patients, it follows a Circular Linked List to decide the nearest available unit for emergency treatment.
Requirements:
● Each node represents a hospital unit.
● Rotate through units until an available one is found.
● Simulate patient redirection in a circular path.
● Remove a unit if it's under maintenance.
 */

import java.util.Scanner;

public class UseAmbulanceRoute {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        AmbulanceRoute route = new AmbulanceRoute();
        int choice;

        // Initial hospital units
        route.addUnit("Emergency", true);
        route.addUnit("Radiology", true);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", true);

        do {
        	System.out.println("\n=========================================================");
        	System.out.println("                      Ambulance Route List                 ");
        	System.out.println("=========================================================\n");
            System.out.println("1. Display Hospital Units");
            System.out.println("2. Redirect Patient");
            System.out.println("3. Put Unit Under Maintenance");
            System.out.println("4. Make Unit Available");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    route.displayUnits();
                    break;

                case 2:
                    route.redirectPatient();
                    break;

                case 3:
                    System.out.print("Enter unit name: ");
                    route.putUnderMaintenance(input.nextLine());
                    break;

                case 4:
                    System.out.print("Enter unit name: ");
                    route.makeUnitAvailable(input.nextLine());
                    break;

                case 5:
                	System.out.println("\n-----------------------------------------------------------");
                	System.out.println("                    Thankyou for visiting                    ");
                	System.out.println("-----------------------------------------------------------\n");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        input.close();
    }
}
