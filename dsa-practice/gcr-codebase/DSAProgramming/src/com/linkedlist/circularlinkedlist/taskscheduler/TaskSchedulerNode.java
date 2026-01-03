package com.linkedlist.circularlinkedlist.taskscheduler;

public class TaskSchedulerNode {
	
	int taskID;
	String taskName;
	String priority;
	int dueDate;
	TaskSchedulerNode next;
	
	public TaskSchedulerNode(int taskID,String taskName, String priority, int dueDate ) {
		
		this.taskID = taskID;
		this.taskName = taskName;
		this.priority = priority;
		this.dueDate = dueDate;
		this.next = null;
	}

}
