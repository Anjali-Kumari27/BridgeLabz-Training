package com.variousinterfaces.queueinterface.stackusingqueue;

import java.util.LinkedList;
import java.util.Queue;

// Stack implementation using two queues
public class StackUsingQueues {

	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();

	// Push operation
	void push(int x) {
		// Add element to q2
		q2.add(x);

		// Move all elements from q1 to q2
		while (!q1.isEmpty()) {
			q2.add(q1.remove());
		}

		// Swap q1 and q2
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}

	// Pop operation
	int pop() {
		if (q1.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return q1.remove();
	}

	// Top operation
	int top() {
		if (q1.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return q1.peek();
	}
}
