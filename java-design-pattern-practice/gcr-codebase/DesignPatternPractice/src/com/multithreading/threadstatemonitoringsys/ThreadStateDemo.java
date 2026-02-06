package com.multithreading.threadstatemonitoringsys;

public class ThreadStateDemo {

    public static void main(String[] args) {

        TaskRunner task1 = new TaskRunner("Task-1");
        TaskRunner task2 = new TaskRunner("Task-2");

        Thread[] tasks = { task1, task2 };

        StateMonitor monitor = new StateMonitor(tasks);

        // NEW state (before start)
        System.out.println("[Main] Task-1 state: " + task1.getState());
        System.out.println("[Main] Task-2 state: " + task2.getState());

        task1.start();
        task2.start();
        monitor.start();
    }
}

