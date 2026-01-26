package com.reflection.retrieveannotation;

@Author(name = "Anjali Singh")
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void showTitle() {
        System.out.println("Book Title: " + title);
    }
}

