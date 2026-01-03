package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class MovieManagementLinkedList {

	// First and last movies in the doubly linked list
    private MovieNode head;
    private MovieNode tail;

    // 1. Add a movie at the beginning of the list
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode node = new MovieNode(title, director, year, rating);

        if (head == null) {
        	// First movie
            head = tail = node;
        } else {
        	
        	// Point new movie to current head
            node.next = head;
            
            // Set current head's previous to new movie
            head.prev = node;
            
            // Update head to new movie
            head = node;
        }
        
        showAddedMovie(node, "At Beginning");
    }

    // 2. Add a movie at the end of the list
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode node = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = node;
        } else {
        	
        	// Current last movie points to new movie
            tail.next = node;
            
            // New movie's previous points to current last
            node.prev = tail;
            
            // Update tail to new movie
            tail = node;
        }
        showAddedMovie(node, "At End");
    }

    // 3. Add a movie at a specific position (1-based)
    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 0) {
            System.out.println("Invalid Position");
            return;
        }

        if (position == 1) {
        	// Add at beginning if position is 1
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
        	
        	// Add at end if position exceeds list
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode node = new MovieNode(title, director, year, rating);
        
        // New node points to next movie
        node.next = temp.next;
        
        // New node's previous points to temp
        node.prev = temp;
        
        // Next movie's previous points to new node
        temp.next.prev = node;
        
        // Temp's next points to new node
        temp.next = node;
        
        showAddedMovie(node, "At Position " + position);
    }

    // 4. Remove by Movie Title
    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("Movie list is empty");
            return;
        }

        MovieNode temp = head;

        while (temp != null) {
            if (temp.movieTitle.equalsIgnoreCase(title)) {

            	// Remove first movie
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } 
                
                // Remove last movie
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } 
                else {
                	// Remove middle movie
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Movie removed successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // 5. Search by Director
    public void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found for director: " + director);
        }
    }

    // 6. Search by Rating
    public void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating >= rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found with rating >= " + rating);
        }
    }

    // 7. Update Rating by Movie Title
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.movieTitle.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // 8. Display Forward (from last ot end)
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies available");
            return;
        }

        MovieNode temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // 9. Display Reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies available");
            return;
        }

        MovieNode temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    //  Display details of a single movie
    private void displayMovie(MovieNode movie) {
        //System.out.println("----------------------------------------");
        System.out.println("\nMovie Title   : " + movie.movieTitle);
        System.out.println("Director      : " + movie.director);
        System.out.println("Release Year  : " + movie.yearOfRelease);
        System.out.println("Rating        : " + movie.rating);
        System.out.println("\n----------------------------------------");
    }

    //Show a newly added movie
    private void showAddedMovie(MovieNode movie, String position) {
        System.out.println("\nMovie Added Successfully (" + position + ")");
        System.out.println("----------------------------------------");
        System.out.println("Movie Title   : " + movie.movieTitle);
        System.out.println("Director      : " + movie.director);
        System.out.println("Release Year  : " + movie.yearOfRelease);
        System.out.println("Rating        : " + movie.rating);
        System.out.println("----------------------------------------");
    }

}

