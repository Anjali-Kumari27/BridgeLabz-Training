package com.bookbazaar;

/*15. "BookBazaar – Digital Bookstore System"
Story: You’re building the backend for BookBazaar, an online bookstore. It must handle book
inventory, orders, and discounts.
Requirements:
● Book class with fields: title, author, price, stock.
● Order class that links a user to one or more books.
● Interface IDiscountable with method applyDiscount().
● Use constructors to create books with optional offers.
● Use operators to compute total cost: price × quantity – discount.
● Encapsulation: inventory count should only be updated through methods.
● Inheritance: EBook, PrintedBook extend Book.
● Polymorphism: applyDiscount() works differently for each book type.
● Access modifiers used to restrict order status updates.
*/


import java.util.Scanner;

public class UseBookBazaar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n===== Welcome to BookBazaar =====\n");

        System.out.print("Enter Customer Name: ");
        String customer = input.nextLine();

        System.out.println("\nSelect Book Type:");
        System.out.println("1. E-Book");
        System.out.println("2. Printed Book");
        int choice = input.nextInt();
        input.nextLine(); 

        System.out.print("Enter Book Title: ");
        String title = input.nextLine();

        System.out.print("Enter Author Name: ");
        String author = input.nextLine();

        System.out.print("Enter Price: ");
        double price = input.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = input.nextInt();

        //created book refrence
        Book book;

        // Create object based on user choice
        if (choice == 1) {
            book = new EBook(title, author, price);
        } else {
            book = new PrintedBook(title, author, price);
        }

        
        // Create order object
        Order order = new Order(book, quantity);
        
        // Place the order
        order.placeOrder();

        System.out.println("\nThank you for shopping at BookBazaar!");
        input.close();
    }
}
