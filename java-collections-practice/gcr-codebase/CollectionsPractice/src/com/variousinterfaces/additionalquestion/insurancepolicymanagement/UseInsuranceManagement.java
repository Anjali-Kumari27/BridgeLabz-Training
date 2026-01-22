package com.variousinterfaces.additionalquestion.insurancepolicymanagement;

import java.time.LocalDate;
import java.util.Scanner;

public class UseInsuranceManagement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PolicyManager manager = new PolicyManager();

        System.out.println("\n==================================");
        System.out.println("    Insurance Management System     ");
        System.out.println("==================================\n");
        System.out.print("Enter number of policies: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Policy Details");

            System.out.print("Policy Number: ");
            int number = input.nextInt();

            System.out.print("Holder Name: ");
            String name = input.next();

            System.out.print("Expiry Date (yyyy-mm-dd): ");
            String date = input.next();

            System.out.print("Coverage Type: ");
            String type = input.next();

            System.out.print("Premium Amount: ");
            double premium = input.nextDouble();

            Policy p = new Policy(
                    number,
                    name,
                    LocalDate.parse(date),
                    type,
                    premium
            );

            manager.addPolicy(p);
        }

        System.out.println("\n-------------------------------");
        System.out.println("    Retrieve policy by number    ");
        System.out.println("-------------------------------\n");
        manager.getPolicyByNumber(input.nextInt());

        System.out.println("\n---------------------------------");
        System.out.println("       Policies Expiring soon      ");
        System.out.println("---------------------------------\n");
        manager.policiesExpiringSoon();

        System.out.println("\nEnter policyholder name:");
        manager.policiesByHolder(input.next());

        System.out.println("\nRemoving expired policies...");
        manager.removeExpiredPolicies();

        System.out.println("\n---------------------------------");
        System.out.println("  Policies in insertion order ");
        System.out.println("---------------------------------\n");
        manager.showInsertionOrder();

        System.out.println("\n---------------------------------");
        System.out.println("  Policies sorted by expiry date   ");
        System.out.println("---------------------------------\n");
        manager.showSortedByExpiry();

        input.close();
    }
}
