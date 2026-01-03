package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class UseOnlineTicket {
	
	public static void main(String[] args) {

		// Create the ticket booking system
		OnlineTicketLinkedList system =
                new OnlineTicketLinkedList();

		// Book tickets for different customers
        system.addTicket(101, "Anjali", "Inception", 12, 1430);
        system.addTicket(102, "Riya", "Avatar", 8, 1500);
        system.addTicket(103, "Rahul", "Inception", 15, 1530);

        // Show all booked tickets
        system.displayTickets();

        // Find ticket booked by a specific customer
        system.searchByCustomer("Anjali");
        
        //Find all tickets for a particular movie
        system.searchByMovie("Inception");

        // removing a ticket using ticket ID
        system.removeTicket(102);

        // Show tickets again after removing
        system.displayTickets();

        // Show total number of booked tickets
        system.countTickets();
    }

}
