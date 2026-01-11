package com.bookshelf;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;

/*
 * BookShelf manages library operations
 */
public class BookShelf {

	// HashMap: Genre = List of Books
	private HashMap<String, LinkedList<Book>> library;

	// HashSet to avoid duplicate ISBNs
	private HashSet<Book> bookSet;

	// Constructor initializes collections
	public BookShelf() {
		library = new HashMap<>();
		bookSet = new HashSet<>();
	}

	// Converts genre input into consistent format
	private String normalizeGenre(String genre) {
		return genre.trim().toLowerCase();
	}

	// Add NEW book to library
	public void addNewBook(String genre, String isbn, String name, String author) {

		genre = normalizeGenre(genre);
		Book book = new Book(isbn, name, author);

		//check duplicate ISBN
		if (bookSet.contains(book)) {
			System.out.println("Book with same ISBN already exists.");
			return;
		}

		// Create genre list if not present
		library.putIfAbsent(genre, new LinkedList<>());
		
		// Add book to list
		library.get(genre).add(book);
		bookSet.add(book);

		System.out.println("New book added successfully.");
	}

	// Borrow a book
	public void borrowBook(String genre, String isbn) {

		genre = normalizeGenre(genre);

		// Check genre existence
		if (!library.containsKey(genre)) {
			System.out.println("Genre not found.");
			return;
		}

		LinkedList<Book> books = library.get(genre);
		Book found = null;

		// Search book by ISBN
		for (Book b : books) {
			if (b.getIsbn().equals(isbn)) {
				found = b;
				break;
			}
		}

		// Remove book if found
		if (found != null) {
			books.remove(found);
			bookSet.remove(found);
			System.out.println("Book borrowed successfully.");
		} else {
			System.out.println("Book not available.");
		}
	}

	// Return a borrowed book
	public void returnBook(String genre, String isbn, String name, String author) {

		genre = normalizeGenre(genre);
		Book book = new Book(isbn, name, author);

		// Prevent duplicate return
		if (bookSet.contains(book)) {
			System.out.println("Book already present in library.");
			return;
		}

		library.putIfAbsent(genre, new LinkedList<>());
		library.get(genre).add(book);
		bookSet.add(book);

		System.out.println("Book returned successfully.");
	}

	
	// method to delete book
	public void deleteBook(String genre, String isbn) {
		genre = normalizeGenre(genre);

		// Check genre existence
		if (!library.containsKey(genre)) {
			System.out.println("Genre not found.");
			return;
		}

		LinkedList<Book> books = library.get(genre);
		Book toDelete = null;

		// Search book
		for (Book b : books) {
			if (b.getIsbn().equals(isbn)) {
				toDelete = b;
				break;
			}
		}

		// Delete book permanently
		if (toDelete != null) {
			books.remove(toDelete);
			bookSet.remove(toDelete);

			// If genre list empty, remove genre
			if (books.isEmpty()) {
				library.remove(genre);
			}

			System.out.println("Book deleted.");
		} else {
			System.out.println("Book not found.");
		}
	}

	// Display all books present in the library
	public void displayLibrary() {

		if (library.isEmpty()) {
			System.out.println("Library is empty.");
			return;
		}

		System.out.println("\n===========================================================");
		System.out.println("                      Library Catalog                        ");
		System.out.println("============================================================\n");
		for (String genre : library.keySet()) {
			System.out.println("Genre: " + genre);
			System.out.println("Books: " + library.get(genre) + "\n");
		}
	}
}
