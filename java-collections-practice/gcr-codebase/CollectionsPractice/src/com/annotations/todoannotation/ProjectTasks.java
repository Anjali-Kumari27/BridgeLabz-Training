package com.annotations.todoannotation;

public class ProjectTasks {

    // First pending task
    @Todo(
        task = "Implement login feature",
        assignedTo = "Anjali",
        priority = "HIGH"
    )
    public void loginFeature() {
        System.out.println("Login feature pending");
    }

    // Second pending task (default priority used)
    @Todo(
        task = "Add logout functionality",
        assignedTo = "Devika"
    )
    public void logoutFeature() {
        System.out.println("Logout feature pending");
    }

    // Normal method (no Todo annotation)
    public void dashboard() {
        System.out.println("Dashboard working fine");
    }
}

