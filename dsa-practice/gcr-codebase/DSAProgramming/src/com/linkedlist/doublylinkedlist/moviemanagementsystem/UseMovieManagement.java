package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class UseMovieManagement {

    public static void main(String[] args) {

    	// Create the movie management system
        MovieManagementLinkedList list = new MovieManagementLinkedList();

        System.out.println("================= Adding Movies ================");
        
        // Add movies at beginning, end, and specific position
        list.addAtBeginning("Inception" , "Christopher Nolan" , 2010  , 8.8);
        list.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        list.addAtEnd("Titanic", "James Cameron", 1997, 7.8);
        list.addAtPosition(2, "Avatar", "James Cameron", 2009, 7.9);

        System.out.println("\n\n================ Movies (Forward) ================");
        // Show all movies from first to last
        list.displayForward();

        System.out.println("\n\n============= Movies (Reverse) ==============");
        list.displayReverse();

        System.out.println("\n\n============== Search by Director =============\n");
        list.searchByDirector("Christopher Nolan");

        System.out.println("\n================ Update Rating ===================\n");
        // Update the rating of a specific movie
        list.updateRating("Titanic", 8.0);

        System.out.println("\n================ Remove Movie ===================\n");
        // Remove a movie by its title
        list.removeByTitle("Avatar");

        // Display the final list of movies after updates
        System.out.println("\n\n=============== Final Movie List =================");
        list.displayForward();
    }
}

