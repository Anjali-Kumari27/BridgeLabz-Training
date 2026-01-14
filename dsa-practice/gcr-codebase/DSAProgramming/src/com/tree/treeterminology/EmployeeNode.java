package com.tree.treeterminology;

import java.util.ArrayList;

//This class represents one employee in the organization tree
public class EmployeeNode {

    // Employee name
    String name;

    // List to store child employees (subordinates)
    ArrayList<EmployeeNode> children;

    // Constructor to initialize employee name and children list
    EmployeeNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    // Method to add a child (subordinate) to this employee
    void addChild(EmployeeNode child) {
        children.add(child);
    }
}
