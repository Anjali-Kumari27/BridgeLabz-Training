package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class OnlineTicketLinkedList {

	    // First ticket in the list (starting point)
	    private OnlineTicketNode head = null;
	    
	    // Keeps count of total booked tickets
	    private int ticketCount = 0;

	    // 1. Book a new ticket and add it to the system
	    public void addTicket(int id, String customer, String movie,
	                          int seat, int time) {

	    	// Create a new ticket with given details
	        OnlineTicketNode newTicket =
	                new OnlineTicketNode(id, customer, movie, seat, time);

	        System.out.println("Booking Ticket...");
	        System.out.println("Ticket ID : " + id +
	                " | Customer : " + customer +
	                " | Movie : " + movie);

	        // If this is the first ticket
	        if (head == null) {
	            head = newTicket;
	            newTicket.next = head;   // Points back to itself (circular)
	        } 
	        else {
	        	
	        	// Move to the last booked ticket
	            OnlineTicketNode temp = head;
	            while (temp.next != head) {
	                temp = temp.next;
	            }
	            
	            // Add new ticket at the end
	            temp.next = newTicket;
	            newTicket.next = head;
	        }

	        // Increase total ticket count
	        ticketCount++;
	        
	        System.out.println("Ticket Booked Successfully");
	        System.out.println("-----------------------------------");
	    }

	 // 2. Remove a ticket using Ticket ID
	    public void removeTicket(int ticketID) {

	    	// If no tickets are booked
	        if (head == null) {
	            System.out.println("No tickets available");
	            return;
	        }

	        OnlineTicketNode curr = head;
	        OnlineTicketNode prev = null;

	        do {
	        	// If matching ticket is found
	            if (curr.ticketID == ticketID) {

	            	// Only one ticket exists
	                if (curr == head && curr.next == head) {
	                    head = null;
	                }
	                
	                // If first ticket is removed
	                else if (curr == head) {
	                    OnlineTicketNode last = head;
	                    while (last.next != head) {
	                        last = last.next;
	                    }
	                    head = head.next;
	                    last.next = head;
	                }
	                
	                // If middle or last ticket is removed
	                else {
	                    prev.next = curr.next;
	                }

	                // Decrease ticket count
	                ticketCount--;
	                System.out.println("Ticket ID " + ticketID + " cancelled successfully");
	                return;
	            }

	            prev = curr;
	            curr = curr.next;

	        } 
	        while (curr != head);

	        // If ticket ID is not found
	        System.out.println("Ticket ID not found");
	    }

	    // 3. Show all booked tickets
	    public void displayTickets() {

	    	// If no tickets are booked
	        if (head == null) {
	            System.out.println(" No tickets booked");
	            return;
	        }

	        System.out.println("\n=========== BOOKED TICKETS ===========");

	        OnlineTicketNode temp = head;
	        do {
	        	
	        	 // Show one ticket
	            displayTicket(temp);
	            temp = temp.next;
	        } while (temp != head);

	        System.out.println("=====================================");
	    }

	    // 4. Find tickets by customer name
	    public void searchByCustomer(String customerName) {

	        if (head == null) {
	            System.out.println("No tickets available");
	            return;
	        }

	        boolean found = false;
	        OnlineTicketNode temp = head;

	        do {
	            if (temp.customerName.equalsIgnoreCase(customerName)) {
	                displayTicket(temp);
	                found = true;
	            }
	            temp = temp.next;
	        } while (temp != head);

	        if (!found) {
	            System.out.println("No ticket found for customer: " + customerName);
	        }
	    }

	    
	    // 5. Find tickets by movie name
	    public void searchByMovie(String movieName) {

	        if (head == null) {
	            System.out.println("No tickets available");
	            return;
	        }

	        boolean found = false;
	        OnlineTicketNode temp = head;

	        do {
	            if (temp.movieName.equalsIgnoreCase(movieName)) {
	                displayTicket(temp);
	                found = true;
	            }
	            temp = temp.next;
	        } while (temp != head);

	        if (!found) {
	            System.out.println("No tickets found for movie: " + movieName);
	        }
	    }

	    // 6. Show total number of booked tickets
	    public void countTickets() {
	        System.out.println("Total Booked Tickets: " + ticketCount);
	    }

	    // Shows ticket details
	    private void displayTicket(OnlineTicketNode t) {
	        System.out.println("-----------------------------------");
	        System.out.println("Ticket ID     : " + t.ticketID);
	        System.out.println("Customer Name : " + t.customerName);
	        System.out.println("Movie Name    : " + t.movieName);
	        System.out.println("Seat Number   : " + t.seatNumber);
	        System.out.println("Booking Time  : " + t.bookingTime);
	    }
}
