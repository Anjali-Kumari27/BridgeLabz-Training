package com.interfaces.functional.backgroundjobexecution;

/*
 * Background Job Execution
   ○ Scenario: Execute tasks asynchronously.
   ○ Task: Use Runnable functional interface.
 */
public class BackgroundJob {

	public static void main(String[] args) {

		// Runnable functional interface
		// background task
		Runnable task = () -> {
			System.out.println("Task started");

			try {
				// pause to show background work
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Task stopped");
			}

			System.out.println("Task finished");
		};

		// create and start thread for asynchronous execution
		Thread thread = new Thread(task);

		// start() creates a new thread
		thread.start();

		// main thread work
		System.out.println("Main program is running");
	}
}
