package com.linkedlist.doublylinkedlist.librarymanagementsystem;

public class LibraryNode {
	
	String bookTitle;
	String author;
	String genre;
	int bookID;
	boolean availabilityStatus;
	LibraryNode next, prev;
	
	public LibraryNode(String bookTitle, String author, String genre, int bookID, boolean availabilityStatus) {
		
		this.bookTitle = bookTitle;
		this.author = author;
		this.genre = genre;
		this.bookID = bookID;
		this.availabilityStatus = availabilityStatus;
		this.next = this.prev = null;
	}

}
