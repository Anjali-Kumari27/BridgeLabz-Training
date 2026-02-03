package com.smartuniversitylibrarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class CentralizedCatalog {

    private static CentralizedCatalog instance;

    private List<Book> books = new ArrayList<>();
    private List<User> observers = new ArrayList<>();

    private CentralizedCatalog() {}

    public static synchronized CentralizedCatalog getInstance() {
        if (instance == null) {
            instance = new CentralizedCatalog();
        }
        return instance;
    }

    public void addObserver(User user) {
        observers.add(user);
    }

    public void addBook(Book book) {
        books.add(book);
        notifyUsers(book.getTitle());
    }

    private void notifyUsers(String bookName) {
        for (User user : observers) {
            user.update("New book available: " + bookName);
        }
    }
}
