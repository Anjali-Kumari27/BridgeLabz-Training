package com.bookshelf;

//This class represents a single Book
public class Book {

	// private data members
	private String isbn; // unique number
	private String name; // book name
	private String author; // author name

	// Constructor to initialize book details
	public Book(String isbn, String name, String author) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
	}

	// Getter methods
	public String getIsbn() {
		return isbn;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	//Override equals() to compare books using ISBN
	@Override
	public boolean equals(Object obj) {

		// If both references are same
		if (this == obj)
			return true;

		// If object is not Book type
		if (!(obj instanceof Book))
			return false;

		// Type casting object to Book
		Book other = (Book) obj;
		
		// Compare ISBNs
		return isbn.equals(other.isbn);
	}

	
	// Override hashCode() to match equals()
	@Override
	public int hashCode() {
		return isbn.hashCode();
	}

	//Convert book object to readable string
	@Override
	public String toString() {
		return name + " (ISBN: " + isbn + ")";
	}
}
