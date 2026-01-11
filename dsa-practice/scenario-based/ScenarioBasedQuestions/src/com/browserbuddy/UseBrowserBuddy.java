package com.browserbuddy;

import java.util.Scanner;

/*
  BrowserBuddy – Tab History Manager (Doubly Linked List + Stack)
Story: Neha is working on a custom browser. Each open tab maintains its browsing history with "Back" and "Forward" operations. She uses a Doubly Linked List for history and a Stack to hold closed tabs for reopening.
Requirements:
● Support forward and backward navigation.
● Restore recently closed tabs.
● Maintain memory-efficient tab management using pointers.
*/

public class UseBrowserBuddy {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        TabHistory currentTab = new TabHistory();
        BrowserManager manager = new BrowserManager();

        int choice;

        do {
            System.out.println("\n====================================================");
            System.out.println("                   BrowserBuddy Menu                  ");
            System.out.println("=====================================================");
            System.out.println("1. Visit New Page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Show History");
            System.out.println("5. Show Current Page");
            System.out.println("6. Close Tab");
            System.out.println("7. Reopen Last Closed Tab");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter page URL/name: ");
                    currentTab.visitPage(input.nextLine());
                    break;

                case 2:
                    currentTab.goBack();
                    break;

                case 3:
                    currentTab.goForward();
                    break;

                case 4:
                    currentTab.showHistory();
                    break;

                case 5:
                    currentTab.showCurrentPage();
                    break;

                case 6:
                    manager.closeTab(currentTab);
                    currentTab = new TabHistory();
                    break;

                case 7:
                    currentTab = manager.reopenTab();
                    break;

                case 8:
                    System.out.println("Exiting BrowserBuddy.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 8);

        input.close();
    }
}
