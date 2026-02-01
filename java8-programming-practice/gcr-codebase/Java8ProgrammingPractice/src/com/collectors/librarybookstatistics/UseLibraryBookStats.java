package com.collectors.librarybookstatistics;
/*
 * 5. Library Book Statistics
  Given a list of books with their genres and number of pages, use
  Collectors.summarizingInt()
  to find total pages, average pages, and maximum pages per genre.
 */

import java.util.*;
import java.util.stream.Collectors;

public class UseLibraryBookStats {
    public static void main(String[] args) {

        // book list
        List<Book> books = Arrays.asList(
                new Book("Java Basics", "Programming", 350),
                new Book("Advanced Java", "Programming", 500),
                new Book("Python 101", "Programming", 300),
                new Book("World History", "History", 450),
                new Book("Ancient Civilizations", "History", 400),
                new Book("Mystery of the Nile", "Fiction", 280),
                new Book("Thriller Nights", "Fiction", 320)
        );

        // Summarize pages per genre
        Map<String, IntSummaryStatistics> statsByGenre = books.stream()
                .collect(Collectors.groupingBy(
                        Book::getGenre,
                        Collectors.summarizingInt(Book::getPages)
                ));

        // Print results
        statsByGenre.forEach((genre, stats) -> {
            System.out.println("\n-------------------------");
            System.out.println("   Genre: " + genre);
            System.out.println("-------------------------\n");
            System.out.println("  Total Pages: " + stats.getSum());
            System.out.println("  Average Pages: " + stats.getAverage());
            System.out.println("  Maximum Pages: " + stats.getMax());
            System.out.println("  Minimum Pages: " + stats.getMin());
            System.out.println("  Count of Books: " + stats.getCount());
            System.out.println();
        });
    }
}

