package com.addressbooksystem;

import java.util.*;

/*
 * AddressBook class handles all operations
 * Uses ArrayList to store contacts
 */
public class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add contact with duplicate validation
    public void addContact(Contact c) {

        for (Contact existing : contacts) {
            if (existing.getPhone().equals(c.getPhone()) ||
                existing.getEmail().equalsIgnoreCase(c.getEmail())) {

                System.out.println("Contact already exists!");
                return;
            }
        }

        contacts.add(c);
        System.out.println("Contact added successfully!");
    }

    // Edit contact using first name
    public void editContact(String name, Scanner input) {

        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(name)) {

                System.out.print("New Phone: ");
                c.setPhone(input.nextLine());

                System.out.print("New Email: ");
                c.setEmail(input.nextLine());

                System.out.println("Contact updated!");
                return;
            }
        }

        System.out.println("Contact not found!");
    }

    // Delete contact
    public void deleteContact(String name) {

        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            Contact c = it.next();
            if (c.getFirstName().equalsIgnoreCase(name)) {
                it.remove();
                System.out.println("Contact deleted!");
                return;
            }
        }

        System.out.println("Contact not found!");
    }

    // Search by city or state
    public void searchByCityState(String value) {

        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(value) ||
                c.getAddress().getState().equalsIgnoreCase(value)) {

                c.display();
            }
        }
    }

    // Display all contacts sorted alphabetically
    public void displayAll() {

        contacts.sort(
            Comparator.comparing(Contact::getFirstName, String.CASE_INSENSITIVE_ORDER)
        );

        for (Contact c : contacts) {
            c.display();
        }
    }
}
