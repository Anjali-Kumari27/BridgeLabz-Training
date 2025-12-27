package com.constructor.levelone;

public class HotelBooking {
	
	//made attributes private to achieve encapsulation
	private String guestName;
	private String roomType;
	private double nights;
	
	//default constructor
	HotelBooking(){
		
		//using this keyword to access instance variable
		this.guestName = "Anaya";
		this.roomType = "single";
		this.nights = 1.5;
	}
	
	//Parameterized constructor
	HotelBooking(String guestName , String roomType , double nights){
		
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
		
	}

	//copy constructor
	HotelBooking(HotelBooking bookHotel){
		
		this.guestName = bookHotel.guestName;
		this.roomType = bookHotel.roomType;
		this.nights = bookHotel.nights;
		
	}
	
	
	//method for displaying booking details
	void displayHotelBookingDetails() {
		
		System.out.println("GuestName is : " + guestName);
		System.out.println("Booked :" + roomType + " room");
		System.out.println("Booked for : " + nights + " nights");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//created booking1 object for default constructor
		HotelBooking booking1 = new HotelBooking();
		System.out.println("Booking 1 : ");
		
		//using object booking1, calling method to display booking details
		booking1.displayHotelBookingDetails();
		
		
		//booking2 object for parameterized constructor
		//passing arguments 
		HotelBooking booking2 = new HotelBooking("Devika" , "Single" , 2);
		System.out.println("\nBooking 2 : ");
		booking2.displayHotelBookingDetails();
		
		
		//booking3 object for copy constructor
		HotelBooking booking3 = new HotelBooking(booking2);
		System.out.println("\nBooking 3 (copy of Booking 2) : ");
		booking3.displayHotelBookingDetails();
		
		
	}

}
