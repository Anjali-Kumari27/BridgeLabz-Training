package com.jsonhandling.listtojson;

import java.util.List;
import java.util.Map;

public class User {
    private int id;
    private String name;
    private String email;
    private List<String> skills;

    // Default constructor
    public User() {}

    // Constructor
    public User(int id, String name, String email, List<String> skills) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.skills = skills;
    }

    // Getters & setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<String> getSkills() { return skills; }
    public void setSkills(List<String> skills) { this.skills = skills; }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', email='" + email + "', skills=" + skills + "}";
    }
}
