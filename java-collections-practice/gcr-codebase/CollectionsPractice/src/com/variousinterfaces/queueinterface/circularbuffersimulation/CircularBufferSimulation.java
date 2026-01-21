package com.variousinterfaces.queueinterface.circularbuffersimulation;

public class CircularBufferSimulation {

	int[] buffer; // array to store elements
	int size; // buffer size
	int front = 0; // points to oldest element
	int count = 0; // number of elements present

	// Constructor
	CircularBufferSimulation(int size) {
		this.size = size;
		buffer = new int[size];
	}

	// Insert element into buffer
	public void insert(int value) {

		// Calculate position using circular logic
		int position = (front + count) % size;

		// Insert value
		buffer[position] = value;

		// If buffer is full, move front ahead
		if (count == size) {
			front = (front + 1) % size; // overwrite oldest
		} else {
			count++; // increase count if not full
		}
	}

	// Display buffer elements
	public void display() {
		System.out.print("Buffer: [ ");
		for (int i = 0; i < count; i++) {
			System.out.print(buffer[(front + i) % size] + " ");
		}
		System.out.println("]");
	}
}
