package com.interfaces.staticmethod.dateformatutility;

import java.time.LocalDate;
import java.util.Scanner;

public class UseDateFormat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Invoice Date Format Utility");
        System.out.println("Dates formatted using static methods in SimpleDateFormatter interface");
        System.out.println("---------------------------------------------------------------");

        // Get date input from user
        System.out.print("Enter date (yyyy-MM-dd) or press Enter for today: ");
        String inputDate = input.nextLine().trim();

        LocalDate date;
        if (inputDate.isEmpty()) {
            date = LocalDate.now();
            System.out.println("Using today's date: " + date);
        } else {
            try {
                date = LocalDate.parse(inputDate);
            } catch (Exception e) {
                System.out.println("Invalid format. Using today's date.");
                date = LocalDate.now();
            }
        }

        // Show format options
        System.out.println("\n==============================================================");
        System.out.println("                      Available formats                         ");
        System.out.println("==============================================================\n");
        System.out.println("1 - DD-MM-YYYY");
        System.out.println("2 - YYYY-MM-DD");
        System.out.println("3 - DD MMMM YYYY");
        System.out.println("4 - MMMM DD, YYYY (Invoice style)");
        System.out.print("\nChoose format (1-4): ");

        int choice = input.nextInt();
        String formattedDate;

        // Format date based on user choice
        if (choice == 1) {
            formattedDate = DateUtils.formatDDMMYYYY(date);
        } else if (choice == 2) {
            formattedDate = DateUtils.formatYYYYMMDD(date);
        } else if (choice == 3) {
            formattedDate = DateUtils.formatFullMonth(date);
        } else if (choice == 4) {
            formattedDate = DateUtils.formatInvoice(date);
        } else {
            System.out.println("Invalid choice. Using DD-MM-YYYY.");
            formattedDate = DateUtils.formatDDMMYYYY(date);
        }

        System.out.println("\nFormatted date: " + formattedDate);

        //show today's date in all formats
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("                  Today's date in all formats                      ");
        System.out.println("-----------------------------------------------------------------\n");
        LocalDate today = LocalDate.now();
        System.out.println("DD-MM-YYYY    : " + DateUtils.formatDDMMYYYY(today));
        System.out.println("YYYY-MM-DD    : " + DateUtils.formatYYYYMMDD(today));
        System.out.println("Full Month    : " + DateUtils.formatFullMonth(today));
        System.out.println("Invoice Style : " + DateUtils.formatInvoice(today));

        input.close();
    }
}

