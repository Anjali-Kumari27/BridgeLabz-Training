package com.skillforge;

public class Instructor extends User {

    public Instructor(int id, String name, String email) {
        super(id, name, email);
    }

    public void uploadCourse(String courseName) {
        System.out.println(name + " uploaded course: " + courseName);
    }
}
