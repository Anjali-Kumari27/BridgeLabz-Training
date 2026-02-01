package com.collectors.librarybookstatistics;

public class Book {
    private String title;
    private String genre;
    private int pages;

    // Constructor
    public Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }

    // Getters
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public int getPages() { return pages; }

    @Override
    public String toString() {
        return title + " (" + pages + " pages)";
    }
}

