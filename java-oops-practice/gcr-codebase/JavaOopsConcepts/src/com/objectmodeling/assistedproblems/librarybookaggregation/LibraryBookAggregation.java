package com.objectmodeling.assistedproblems.librarybookaggregation;

public class LibraryBookAggregation {

    public static void main(String[] args) {

        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("Atomic Habits", "James Clear");
        Book book3 = new Book("Harry Potter" , "J.K Rowling");

        Library centralLibrary = new Library("Central Library");
        Library departmentLibrary = new Library("Department Library");

        centralLibrary.addBook(book1);
        centralLibrary.addBook(book2);
        departmentLibrary.addBook(book3);

        departmentLibrary.showBooks();
        centralLibrary.showBooks();
    }
}
