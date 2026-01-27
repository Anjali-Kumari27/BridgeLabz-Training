package com.junit.com;

public class TaskPerformance {
	public String longRunningTask() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return "Task Completed";
	}
}
