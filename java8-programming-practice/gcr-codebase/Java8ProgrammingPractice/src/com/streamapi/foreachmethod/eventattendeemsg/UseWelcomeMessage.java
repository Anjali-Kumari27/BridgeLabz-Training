package com.streamapi.foreachmethod.eventattendeemsg;

import java.util.*;

/*
 Event Attendee Welcome Message
 ○ Scenario: Print a welcome message for all attendees.
 ○ Task: Use forEach() with a lambda.
 */
public class UseWelcomeMessage {

    public static void main(String[] args) {

        List<Attendee> attendees = Arrays.asList(
                new Attendee("Anjali"),
                new Attendee("Himanshu"),
                new Attendee("Tisa"),
                new Attendee("Hrushikesh")
        );

        // Stream processing
        System.out.println("\n----------------------------------------------:");
        System.out.println("           Event Guest Welcome Messages          ");
        System.out.println("-----------------------------------------------\n");

        //forEach() with a lambda to print welcome messages 
        attendees.stream()
                /*
                 * forEach is a terminal operation that loops over stream elements
                 * and calls the supplied function on each element.
                 */
                .forEach(guest -> System.out.println("Welcome to the event, " + guest.getName() + "!"));
    }
}
