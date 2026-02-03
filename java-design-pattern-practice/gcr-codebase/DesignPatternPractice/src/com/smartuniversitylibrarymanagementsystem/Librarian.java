package com.smartuniversitylibrarymanagementsystem;

public class Librarian extends AbstractUser {

    public Librarian(String name) {
        super(name);
    }

    @Override
    public void showRole() {
        System.out.println(name + " is a Librarian.");
    }

    @Override
    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}
