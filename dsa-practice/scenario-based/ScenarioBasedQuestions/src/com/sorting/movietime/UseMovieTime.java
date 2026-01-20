package com.sorting.movietime;
import java.util.Scanner;

public class UseMovieTime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Already sorted list
        int[] sortedShows = {1000, 1200, 1500};

        System.out.println("\n=======================================================");
        System.out.println("            MovieTime – Theater Show Listings            ");
        System.out.println("=======================================================\n");
        for(int i = 0; i<sortedShows.length; i++) {
        	System.out.print("Show " + (i+1) + " : " );
        	System.out.println(sortedShows[i]);
        }
        
        InsertionSortShowTime movie = new InsertionSortShowTime(sortedShows);

        System.out.print("Enter NEW show time (unsorted): ");
        int newShow = input.nextInt();

        movie.insertNewShow(newShow);

        System.out.println("\nUpdated Sorted Show Timings:");
        movie.display();

        input.close();
    }
}
