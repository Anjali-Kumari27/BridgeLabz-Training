package com.smartuniversitylibrarymanagementsystem;

public abstract class AbstractUser implements User {

    protected String name;

    public AbstractUser(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
