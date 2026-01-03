package com.linkedlist.circularlinkedlist.robinroundscheduling;

public class RobinRoundLinkedList {
	
	    // First process in the circular list
	    private RobinRoundNode head = null;
	    
	    // Total number of processes in the system
	    private int processCount = 0;

	    // Add a new process to the queue
	    public void addProcess(int id, double burstTime, String priority) {

	    	// Create a new process with given details
	        RobinRoundNode newProcess =
	                new RobinRoundNode(id, burstTime, priority);

	        System.out.println("Adding Process...\n");
	        System.out.println("PID: " + id +
	                " | Burst Time: " + burstTime +
	                " | Priority: " + priority);

	        // If this is the first process
	        if (head == null) {
	            head = newProcess;
	            newProcess.next = head; // Points back to itself (circular)
	        } 
	        else {
	        	
	        	// Go to the last process in the list
	            RobinRoundNode temp = head;
	            while (temp.next != head) {
	                temp = temp.next;
	            }
	            
	            // Add new process at the end
	            temp.next = newProcess;
	            newProcess.next = head;
	        }

	        // Increase total process count
	        processCount++;
	        
	        System.out.println("Process Added Successfully");
	        System.out.println("\n-----------------------------------\n");
	    }

	    // Display processes
	    public void displayProcesses() {

	    	// If no process exists
	        if (head == null) {
	            System.out.println("No processes in queue.");
	            return;
	        }

	        // Table heading
	        System.out.println("\n=========== PROCESS QUEUE ===========\n");
	        System.out.printf("%-8s %-12s %-10s%n",
	                "PID", "BURST", "PRIORITY");
	        System.out.println("------------------------------------");

	        // Start from first process
	        RobinRoundNode temp = head;
	        
	        do {
	        	// Display details of one process
	            System.out.printf("%-8d %-12.2f %-10s%n",
	                    temp.processID,
	                    temp.burstTime,
	                    temp.priority);
	            temp = temp.next;
	        } while (temp != head);

	        System.out.println("\n====================================\n");
	    }

	    // Round Robin Scheduling Simulation
	    public void schedule(double timeQuantum) {

	    	// If no processes are available
	        if (head == null) {
	            System.out.println("No processes to schedule.");
	            return;
	        }

	        // Tracks total time passed
	        double currentTime = 0;
	        
	        // Used to calculate averages later
	        double totalWaitingTime = 0;
	        double totalTurnAroundTime = 0;

	        // Current process being executed
	        RobinRoundNode curr = head;
	        RobinRoundNode prev = null;

	        System.out.println("\nROUND ROBIN SCHEDULING STARTED");
	        System.out.println("Time Quantum = " + timeQuantum);
	        System.out.println("------------------------------------");

	        // Continue until all processes are finished
	        while (processCount > 0) {

	            System.out.println("\nExecuting Process P" + curr.processID);

	            // If process can finish in given time
	            if (curr.burstTime <= timeQuantum) {

	            	// Add remaining time to current time
	                currentTime += curr.burstTime;
	                curr.burstTime = 0;

	                // Calculate times
	                double turnaround = currentTime;
	                double waiting = turnaround - curr.originalBurst;

	                totalWaitingTime += waiting;
	                totalTurnAroundTime += turnaround;

	                System.out.println("Process P" + curr.processID + " Completed");
	                System.out.println("Turnaround Time: " + turnaround +
	                        " | Waiting Time: " + waiting);

	                // If this was the only process
	                if (curr == head && curr.next == head) {
	                    head = null;
	                    processCount--;
	                    break;
	                }

	                // If head process is completed
	                if (curr == head) {
	                    RobinRoundNode last = head;
	                    while (last.next != head) {
	                        last = last.next;
	                    }
	                    head = head.next;
	                    last.next = head;
	                    curr = head;
	                } 
	                
	                // If middle or last process is completed
	                else {
	                    prev.next = curr.next;
	                    curr = curr.next;
	                }

	                // Reduce number of active processes
	                processCount--;

	            } else {

	            	// Process runs only for time quantum
	                curr.burstTime -= timeQuantum;
	                currentTime += timeQuantum;

	                System.out.println("Process P" + curr.processID +
	                        " remaining burst: " + curr.burstTime);

	                // Move to next process
	                prev = curr;
	                curr = curr.next;
	            }

	            // Show updated process list
	            displayProcesses();
	        }

	        // Final result summary
	        System.out.println("\n=========== FINAL STATISTICS ===========\n");
	        System.out.println("Average Waiting Time     : "
	                + (totalWaitingTime / (totalWaitingTime == 0 ? 1 : (totalTurnAroundTime / totalTurnAroundTime))));
	        System.out.println("Average Turnaround Time  : "
	                + (totalTurnAroundTime / (totalTurnAroundTime == 0 ? 1 : (totalTurnAroundTime / totalTurnAroundTime))));
	        System.out.println("\n=======================================");
	    }
}
