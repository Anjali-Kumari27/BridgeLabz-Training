package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class OnlineTicketNode {
	
	int ticketID;
	String customerName;
	String movieName;
	int seatNumber;
	int bookingTime;
	OnlineTicketNode next;
	
	public OnlineTicketNode(int ticketID , String customerName , String movieName , int seatNumber , int bookingTime) {
		
		this.ticketID = ticketID;
		this.customerName = customerName;
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.bookingTime = bookingTime;
		this.next = null;
	}

}
