package com.reflection.dynamicallycreatedobjects;

public class Student {
 private String name;
 private int age;

 // Constructor
 public Student(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Method to display details
 public void display() {
     System.out.println("Student Name: " + name + ", Age: " + age);
 }
}

