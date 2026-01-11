package com.bookshelf;

import java.util.Scanner;

/*
 BookShelf – Library Organizer (HashMap + Linked List)
Story: In a library system, books are arranged based on genre and author. A HashMap maps genre → list of books (LinkedList). Each list is dynamically updated when books are borrowed or returned.
Requirements:
● Maintain genre-wise catalog.
● Efficient insert, delete using LinkedList.
● Avoid duplication using HashSet (optional).

 */
public class UseBookShelf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BookShelf shelf = new BookShelf();
        int choice;

        do {
            System.out.println("\n================================================");
            System.out.println("                 Library Menu                     ");
            System.out.println("=================================================\n");
            System.out.println("1. Add New Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Display Library");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Genre: ");
                    String genre = input.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = input.nextLine();

                    System.out.print("Enter Book Name: ");
                    String name = input.nextLine();
                    
                    System.out.print("Enter Author Name: ");
                    String author = input.nextLine();

                    shelf.addNewBook(genre, isbn, name, author);
                    break;

                case 2:
                    System.out.print("Enter Genre: ");
                    String g = input.nextLine();

                    System.out.print("Enter ISBN: ");
                    String bi = input.nextLine();

                    shelf.borrowBook(g, bi);
                    break;
                    

                case 3:
                    System.out.print("Enter Genre: ");
                    String rg = input.nextLine();

                    System.out.print("Enter ISBN: ");
                    String ri = input.nextLine();

                    System.out.print("Enter Book Name: ");
                    String rn = input.nextLine();
                    
                    System.out.print("Enter Author Name: ");
                    String ra = input.nextLine();

                    shelf.returnBook(rg, ri, rn, ra);
                    break;

                case 4:
                    System.out.print("Enter Genre: ");
                    String dg = input.nextLine();
                    System.out.print("Enter ISBN: ");
                    String di = input.nextLine();
                    shelf.deleteBook(dg, di);
                    break;
                    
                case 5:
                    shelf.displayLibrary();
                    break;

                case 6:
                    System.out.println("ThankYou for using Library System!!!!!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        input.close();
    }
}
