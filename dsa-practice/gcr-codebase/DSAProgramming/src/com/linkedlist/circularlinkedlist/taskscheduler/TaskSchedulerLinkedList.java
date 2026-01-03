package com.linkedlist.circularlinkedlist.taskscheduler;

public class TaskSchedulerLinkedList {
	
	    // First task in the circular list
	    private TaskSchedulerNode head = null;

	    // 1. Add a new task to the scheduler
	    public void addTask(int id, String name, String priority, int dueDate) {

	    	// Create a new task node with given details
	        TaskSchedulerNode newTask =
	                new TaskSchedulerNode(id, name, priority, dueDate);

	        System.out.println("Adding Task.....\n.");
	        System.out.println("Task ID: " + id +
	                " | Name: " + name +
	                " | Priority: " + priority +
	                " | Due Date: " + dueDate);

	        //If this is the first task
            if (head == null) {
            	
	            head = newTask;
	            newTask.next = head; // Points to itself (circular)
	        } 
            else {
            	
            	// Go to last task in the list
	            TaskSchedulerNode temp = head;
	            while (temp.next != head) {
	                temp = temp.next;
	            }
	            
	            // Add new task at the end
	            temp.next = newTask;
	            newTask.next = head;
	        }

	        System.out.println("Task Added Successfully!\n");
	        System.out.println("---------------------------------------------------------------------------\n");
	    }

	    // 2. Remove a task using its ID
	    public void removeTask(int taskID) {

	    	// If no tasks exist
	        if (head == null) {
	            System.out.println(" No tasks to remove.");
	            return;
	        }

	        TaskSchedulerNode curr = head;
	        TaskSchedulerNode prev = null;

	        do {
	        	// If matching task found
	            if (curr.taskID == taskID) {

	            	// Only one task exists
	                if (curr == head && curr.next == head) {
	                    head = null;
	                } else {
	                	
	                	// Removing head task
	                    if (curr == head) {
	                        TaskSchedulerNode last = head;
	                        while (last.next != head) {
	                            last = last.next;
	                        }
	                        head = head.next;
	                        last.next = head;
	                    } 
	                    else {
	                    	// Removing middle or last task
	                        prev.next = curr.next;
	                    }
	                }

	                System.out.println("\nTask with ID " + taskID + " removed.\n");
	                return;
	            }

	            prev = curr;
	            curr = curr.next;

	        } while (curr != head);

	        // If task ID not found
	        System.out.println(" Task ID not found.");
	    }

	    // 3. Show all tasks in the scheduler
	    public void displayTasks() {

	    	// If no tasks exist
	        if (head == null) {
	            System.out.println(" No tasks available.");
	            return;
	        }

	        System.out.println("\n=============== TASK SCHEDULER ================");
	        System.out.printf("%-8s %-18s %-10s %-10s%n",
	                "ID", "TASK NAME", "PRIORITY", "DUE DATE");
	        System.out.println("-----------------------------------------------");

	        // Start from first task
	        TaskSchedulerNode temp = head;
	        do {
	        	// Show task details
	            System.out.printf("%-8d %-18s %-10s %-10d%n",
	                    temp.taskID,
	                    temp.taskName,
	                    temp.priority,
	                    temp.dueDate);
	            temp = temp.next;
	        } while (temp != head);

	        System.out.println("================================================\n");
	    }

	    // 4. Find tasks by priority
	    public void searchByPriority(String priority) {

	    	// If no tasks exist
	        if (head == null) {
	            System.out.println(" No tasks available.");
	            return;
	        }

	        System.out.println("\n Tasks with Priority: " + priority);
	        boolean found = false;

	        TaskSchedulerNode temp = head;
	        do {
	        	
	        	// If task matches the priority
	            if (temp.priority.equalsIgnoreCase(priority)) {
	                System.out.println("• " + temp.taskName +
	                        " (ID: " + temp.taskID + ")");
	                found = true;
	            }
	            temp = temp.next;
	        } while (temp != head);

	        if (!found) {
	            System.out.println(" No tasks found with this priority.");
	        }
	    }
}
