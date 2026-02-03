package com.smartuniversitylibrarymanagementsystem;

public class Faculty extends AbstractUser {

    public Faculty(String name) {
        super(name);
    }

    @Override
    public void showRole() {
        System.out.println(name + " is a Faculty.");
    }

    @Override
    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}
