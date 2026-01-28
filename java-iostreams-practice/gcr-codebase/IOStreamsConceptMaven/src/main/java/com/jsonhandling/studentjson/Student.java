package com.jsonhandling.studentjson;

import java.util.List;

public class Student {

    private String name;
    private int age;
    private List<String> subjects;

    // constructor
    public Student(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    // getters (VERY IMPORTANT for Jackson)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSubjects() {
        return subjects;
    }
}

