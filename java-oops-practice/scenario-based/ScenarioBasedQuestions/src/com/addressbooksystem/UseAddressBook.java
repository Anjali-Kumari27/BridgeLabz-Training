package com.addressbooksystem;

/*
 * Address Book System
 OOP Concepts:
Classes, Objects, Encapsulation, Constructors, Access Modifiers, Collections
 Scenario:
You’ve been hired by DigiContact Pvt. Ltd., a startup creating digital tools for managing
contacts and relationships. They want a simple but robust Address Book application.
Each Contact should include:
● First Name, Last Name
● Phone Number, Email
● Address (optional: City, State, Zip)
 Problem Statement:
Develop a Java application that:
● Adds a new contact (with validation for duplicates)
● Edits an existing contact by name
● Deletes a contact by name
● Searches contacts by city or state
● Displays all contacts sorted alphabetically
● Stores contacts in an in-memory structure like ArrayList<Contact>
Use:
● Classes and constructors to initialize contacts
● Encapsulation for secure data access
● Optional use of composition (Address as a separate class)

 */

import java.util.Scanner;

public class UseAddressBook {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        AddressBook book = new AddressBook();
        int choice;

        do {
            System.out.println("\n===============================================================");
            System.out.println("                        Address Book Menu                        ");
            System.out.println("===============================================================\n");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search by City/State");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("\nFirst Name: ");
                    String fn = input.nextLine();

                    System.out.print("Last Name: ");
                    String ln = input.nextLine();

                    System.out.print("Phone: ");
                    String phone = input.nextLine();

                    System.out.print("Email: ");
                    String email = input.nextLine();

                    System.out.print("City: ");
                    String city = input.nextLine();

                    System.out.print("State: ");
                    String state = input.nextLine();

                    System.out.print("Zip: ");
                    String zip = input.nextLine();

                    Address addr = new Address(city, state, zip);
                    Contact c = new Contact(fn, ln, phone, email, addr);

                    book.addContact(c);
                    break;

                case 2:
                    System.out.print("\nEnter First Name to Edit: ");
                    book.editContact(input.nextLine(), input);
                    break;

                case 3:
                    System.out.print("\nEnter First Name to Delete: ");
                    book.deleteContact(input.nextLine());
                    break;

                case 4:
                    System.out.print("\nEnter City or State: ");
                    book.searchByCityState(input.nextLine());
                    break;

                case 5:
                    book.displayAll();
                    break;

                case 6:
                    System.out.println("\n***********************************************************");
                    System.out.println("          Thank you for using the Address Book!!!!!!!        ");
                    System.out.println("***********************************************************\n");
                    break;

                default:
                    System.out.println("\nInvalid choice....try again");
            }

        } while (choice != 6);

        input.close();
    }
}
