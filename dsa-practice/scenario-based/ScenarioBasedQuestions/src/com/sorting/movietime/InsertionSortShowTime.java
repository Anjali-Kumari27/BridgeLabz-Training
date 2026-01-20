package com.sorting.movietime;

public class InsertionSortShowTime {

	private int[] showTimes;
	private int size;

	// Constructor: system already has sorted list
	public InsertionSortShowTime(int[] initialSortedTimes) {
		showTimes = new int[initialSortedTimes.length + 5];
		size = initialSortedTimes.length;

		for (int i = 0; i < size; i++) {
			showTimes[i] = initialSortedTimes[i];
		}
	}

	// Insert UNSORTED new show time
	public void insertNewShow(int newTime) {

		int i = size - 1;

		while (i >= 0 && showTimes[i] > newTime) {
			showTimes[i + 1] = showTimes[i];
			i--;
		}

		showTimes[i + 1] = newTime;
		size++;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(showTimes[i]);
		}
	}
}
