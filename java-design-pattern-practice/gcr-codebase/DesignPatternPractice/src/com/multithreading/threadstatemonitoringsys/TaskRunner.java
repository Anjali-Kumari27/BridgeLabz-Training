package com.multithreading.threadstatemonitoringsys;

public class TaskRunner extends Thread {

    public TaskRunner(String name) {
        this.setName(name);
    }

    @Override
    public void run() {

        // RUNNABLE state (computation)
        for (int i = 0; i < 1_000_000; i++) {
            int x = i * i;
        }

        // TIMED_WAITING state
        try {
            Thread.sleep(2000); // 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // RUNNABLE again (final computation)
        for (int i = 0; i < 1_000_000; i++) {
            int y = i + i;
        }
        // TERMINATED after run() finishes
    }
}

