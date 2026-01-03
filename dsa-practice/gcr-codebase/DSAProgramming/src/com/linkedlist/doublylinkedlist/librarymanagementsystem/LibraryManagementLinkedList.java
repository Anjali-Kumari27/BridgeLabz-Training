package com.linkedlist.doublylinkedlist.librarymanagementsystem;

public class LibraryManagementLinkedList {

	// First and last books in the doubly linked list
    private LibraryNode head;
    private LibraryNode tail;

    // 1. Add new book at Beginning
    public void addAtBeginning(String title, String author, String genre, int id, boolean status) {
        LibraryNode node = new LibraryNode(title, author, genre, id, status);

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }

        showAddedBook(node, "At Beginning");
    }

    // 2. Add a new book at the end
    public void addAtEnd(String title, String author, String genre, int id, boolean status) {
        LibraryNode node = new LibraryNode(title, author, genre, id, status);

        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

        showAddedBook(node, "At End");
    }

    // 3. Add at Specific Position (1-based)
    public void addAtPosition(int position, String title, String author, String genre, int id, boolean status) {
        if (position <= 0) {
            System.out.println("Invalid Position");
            return;
        }

        if (position == 1) {
            addAtBeginning(title, author, genre, id, status);
            return;
        }

        LibraryNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, author, genre, id, status);
            return;
        }

        LibraryNode node = new LibraryNode(title, author, genre, id, status);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;

        showAddedBook(node, "At Position " + position);
    }

    // 4. Remove by Book ID
    public void removeByBookID(int id) {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        LibraryNode temp = head;

        while (temp != null) {
            if (temp.bookID == id) {

            	// Remove head
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } 
                
                // Remove tail
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } 
                
                // Remove middle node
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Book removed successfully (ID: " + id + ")");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    // 5. Search by Book Title
    public void searchByTitle(String title) {
        LibraryNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.bookTitle.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Book not found with title: " + title);
        }
    }

    // 6. Search by Author
    public void searchByAuthor(String author) {
        LibraryNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No books found by author: " + author);
        }
    }

    // 7. Update Availability Status of book
    public void updateAvailability(int id, boolean status) {
        LibraryNode temp = head;

        while (temp != null) {
            if (temp.bookID == id) {
                temp.availabilityStatus = status;
                System.out.println("Availability updated successfully for Book ID: " + id);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    // 8. Display Forward (from start to end)
    public void displayForward() {
        if (head == null) {
            System.out.println("No books available");
            return;
        }

        LibraryNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // 9. Display Reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No books available");
            return;
        }

        LibraryNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // 10. Count Total Books
    public void countBooks() {
        int count = 0;
        LibraryNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total number of books in library: " + count);
    }

    // Display Book
    private void displayBook(LibraryNode book) {
        System.out.println("----------------------------------------");
        System.out.println("Book ID      : " + book.bookID);
        System.out.println("Title        : " + book.bookTitle);
        System.out.println("Author       : " + book.author);
        System.out.println("Genre        : " + book.genre);
        System.out.println("Available    : " + (book.availabilityStatus ? "Yes" : "No"));
    }

    // Show newly Added Book
    private void showAddedBook(LibraryNode book, String position) {
        System.out.println("\nBook Added Successfully (" + position + ")");
        displayBook(book);
        System.out.println("----------------------------------------");
    }
}

