package com.sorting.smartshelf;

/*
 * SmartShelf – Real-Time Book Arrangement (Insertion Sort)
Story: In a digital library kiosk, as users add books to their reading list, the system must keep
the list sorted alphabetically by title. Since books are added one at a time and the list is
mostly sorted, Insertion Sort fits perfectly.
Key Concepts:
● Online/real-time sorting
● Efficient for nearly sorted data
● Stable sorting by title

 */

import java.util.Scanner;

//SmartShelf Book Arrangement
public class InsertionSortSmartShelf {

 // Method to sort book titles using Insertion Sort
 static void insertionSort(String[] books) {
     for (int i = 1; i < books.length; i++) {
         String key = books[i];
         int j = i - 1;

         // Shift books that are greater than key
         while (j >= 0 && books[j].compareToIgnoreCase(key) > 0) {
             books[j + 1] = books[j];
             j--;
         }

         // Place book at correct position
         books[j + 1] = key;
     }
 }

 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.println("\n=================================================");
     System.out.println("             Smart Shelf Book System               ");
     System.out.println("=================================================\n");
     // Input number of books
     System.out.print("Enter number of books: ");
     int n = input.nextInt();
     input.nextLine(); // consume newline

     String[] books = new String[n];

     // Input book titles
     System.out.println("Enter book titles:");
     for (int i = 0; i < n; i++) {
    	 System.out.print("Title of Book " + (i+1) +" :");
         books[i] = input.nextLine();
     }

     // Sort books alphabetically
     insertionSort(books);

     // Display sorted book list
     System.out.println("\n------------------------------------------------");
     System.out.println("           Sorted Books (Alphabetically)          ");
     System.out.println("------------------------------------------------\n");
     for (String book : books) {
         System.out.println(book);
     }

     input.close();
 }
}

