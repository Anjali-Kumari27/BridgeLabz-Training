package com.eventease;

/*"EventEase – Event Management Platform"
Story: EventEase helps users organize events like birthdays, weddings, and conferences.
You’re responsible for the booking and scheduling module.
Requirements:
● Event class: eventName, location, date, attendees.
● User class to represent the organizer.

Scenario-based Problems
● Constructors to create events with or without catering/decoration packages.
● ISchedulable interface with methods schedule(), reschedule(), cancel().
● Use access modifiers to restrict editing of eventId once assigned.
● Use operators to calculate costs (venue + services – discounts).
● Inheritance: BirthdayEvent, ConferenceEvent extend Event.
● Polymorphism: schedule() behaves differently based on event type.
● Apply encapsulation to protect pricing and sensitive user data.
*/


import java.util.Scanner;

public class UseEventEase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean runApp = true;

        while (runApp) {

            System.out.println("\nSelect Event Type:");
            System.out.println("1. Birthday Event");
            System.out.println("2. Conference Event");
            System.out.println("3. Exit");
            int choice = input.nextInt();

            if (choice == 3) {
                System.out.println("Exiting application...");
                break;
            }

            System.out.print("Enter Event ID: ");
            int eventId = input.nextInt();
            input.nextLine();

            System.out.print("Enter Event Name: ");
            String name = input.nextLine();

            System.out.print("Enter Event Date: ");
            String date = input.nextLine();

            System.out.print("Enter Venue Cost: ");
            double venueCost = input.nextDouble();

            Event event;

            if (choice == 1) {
                System.out.print("Enter Catering Cost: ");
                double cateringCost = input.nextDouble();

                System.out.print("Enter Decoration Cost: ");
                double decorationCost = input.nextDouble();

                System.out.print("Enter Discount: ");
                double discount = input.nextDouble();

                event = new BirthdayEvent(
                        name, date, eventId,
                        venueCost, cateringCost, decorationCost, discount
                );
            } else {
                event = new ConferenceEvent(name, date, eventId, venueCost);
            }

            boolean manageEvent = true;
            boolean isScheduled = false;

            while (manageEvent) {

                System.out.println("\nChoose Action:");
                System.out.println("1. Schedule Event");
                System.out.println("2. Reschedule Event");
                System.out.println("3. Cancel Event");
                System.out.println("4. Schedule Next Event");
                System.out.println("5. Exit");

                int action = input.nextInt();
                input.nextLine();

                switch (action) {

                    case 1:
                        if (!isScheduled) {
                            event.schedule();
                            event.showBill();
                            isScheduled = true;
                        } else {
                            System.out.println("Event already scheduled.");
                        }
                        break;

                    case 2:
                        if (isScheduled && !event.isCancelled()) {
                            System.out.print("Enter new date: ");
                            String newDate = input.nextLine();
                            event.reschedule(newDate);
                        } else {
                            System.out.println("Cannot reschedule.");
                        }
                        break;

                    case 3:
                        if (isScheduled) {
                            event.cancel();
                            manageEvent = false;
                        } else {
                            System.out.println("Please schedule first.");
                        }
                        break;

                    case 4:
                        manageEvent = false;
                        break;

                    case 5:
                        manageEvent = false;
                        runApp = false;
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            }
        }

        input.close();
    }
}
