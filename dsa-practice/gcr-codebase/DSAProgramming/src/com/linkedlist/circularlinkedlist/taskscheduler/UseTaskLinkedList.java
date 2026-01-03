package com.linkedlist.circularlinkedlist.taskscheduler;

public class UseTaskLinkedList {
	public static void main(String[] args) {

		// Create the task scheduler system
		TaskSchedulerLinkedList scheduler = new TaskSchedulerLinkedList();

		// Add some tasks to the scheduler
        scheduler.addTask(101, "Project Report", "High", 20);
        scheduler.addTask(102, "Database Backup", "Medium", 18);
        scheduler.addTask(103, "Code Review", "High", 19);
        scheduler.addTask(104, "Client Meeting", "Low", 21);

        // Display all tasks
        scheduler.displayTasks();

        // Search and show tasks with High priority
        scheduler.searchByPriority("High");

        // Remove a task by its ID
        scheduler.removeTask(102);

        // Display tasks again after removal
        scheduler.displayTasks();
        
    }

}
