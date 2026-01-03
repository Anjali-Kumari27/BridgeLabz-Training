package com.linkedlist.circularlinkedlist.robinroundscheduling;

public class RobinRoundNode {
	
	int processID;
	double burstTime;
	double originalBurst;
	String priority;
	RobinRoundNode next;
	
	public RobinRoundNode(int processID , double burstTime , String priority) {
		this.processID = processID;
		this.burstTime = burstTime;
		this.originalBurst = burstTime;
		this.priority = priority;
		this.next = null;
	}

}
