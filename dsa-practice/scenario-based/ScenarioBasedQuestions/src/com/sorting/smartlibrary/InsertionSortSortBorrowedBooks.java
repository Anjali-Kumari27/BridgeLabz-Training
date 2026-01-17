package com.sorting.smartlibrary;

/*
 * SmartLibrary – Auto-Sort Borrowed Books (Insertion Sort)
Story: A digital kiosk in a library maintains a list of books a user has borrowed. Every time a
new book is issued, the system adds it to the user's list while keeping it alphabetically sorted
by title. Since insertions are done one at a time, and the list is usually already sorted, Insertion
Sort is the perfect fit.

Concepts Involved:
● Insertion Sort
● Dynamic list insertion
● Nearly sorted data
 */

import java.util.Scanner;
public class InsertionSortSortBorrowedBooks {
	
	public static void insertionSort(String[] books) {
		for(int i = 0; i < books.length; i++) {
			
			String key = books[i];
			int j = i-1;
			
			while(j >= 0 && books[j].compareToIgnoreCase(key)>0) {
				books[j+1] = books[j];
				j--;
			}
			books[j+1] = key;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n==================================================================");
		System.out.println("                     Welcome to Smart Library                       ");
		System.out.println("==================================================================\n");
		
		System.out.print("Enter Number of books present in the library : ");
		int totalBook = input.nextInt();
		
		String[] books = new String[totalBook];
		
		System.out.println("\n****************************");
		System.out.println(" Enter Titles of each Book  ");
		System.out.println("****************************\n");
		input.nextLine();
		for(int i=0; i < totalBook; i++) {
			System.out.print("Title of Book " + (i+1) + " is : ");
			books[i] = input.nextLine();
		}
		
		insertionSort(books);
		
		System.out.println("\n-----------------------------------------------");
		System.out.println("       Books after Sorting (Alphabetically)      ");
		System.out.println("-----------------------------------------------\n");
		
		for(String book : books) {
			System.out.println(book);
		}
		
		input.close();
	}
}
