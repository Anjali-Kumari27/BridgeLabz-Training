package com.multithreading.printjobscheduler;

public class PrintShop {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Starting print jobs...");

        long startTime = System.currentTimeMillis();

        Thread t1 = new Thread(new PrintJob("Job1", 10, 5), "Job1-Thread");
        Thread t2 = new Thread(new PrintJob("Job2", 5, 8), "Job2-Thread");
        Thread t3 = new Thread(new PrintJob("Job3", 15, 3), "Job3-Thread");
        Thread t4 = new Thread(new PrintJob("Job4", 8, 6), "Job4-Thread");
        Thread t5 = new Thread(new PrintJob("Job5", 12, 7), "Job5-Thread");

        // Set thread priorities
        t1.setPriority(5);  // Medium
        t2.setPriority(8);  // High
        t3.setPriority(3);  // Low
        t4.setPriority(6);  // Medium
        t5.setPriority(7);  // High

        // Start jobs
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Wait for all jobs to complete
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        long endTime = System.currentTimeMillis();

        System.out.println("All jobs completed in "
                + (endTime - startTime) + " ms");
    }
}
