package com.linkedlist.circularlinkedlist.robinroundscheduling;

public class UseRoundRobin {
	public static void main(String[] args) {

		// Create the round-robin scheduler system
		RobinRoundLinkedList scheduler = new RobinRoundLinkedList();

		// Add processes with ID, required time, and priority
        scheduler.addProcess(1, 10, "High");
        scheduler.addProcess(2, 5, "Medium");
        scheduler.addProcess(3, 8, "Low");

        // Show all processes before scheduling starts
        scheduler.displayProcesses();

         // Start round-robin scheduling
        // Each process gets 3 units of time per turn
        scheduler.schedule(3); // Time Quantum = 3
    }

}
