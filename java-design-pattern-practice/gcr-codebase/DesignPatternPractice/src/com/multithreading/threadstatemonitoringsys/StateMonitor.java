package com.multithreading.threadstatemonitoringsys;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StateMonitor extends Thread {

    private Thread[] threads;
    private Map<String, Set<Thread.State>> stateHistory = new HashMap<>();

    public StateMonitor(Thread[] threads) {
        this.threads = threads;
        this.setName("Monitor");
    }

    @Override
    public void run() {

        boolean allTerminated = false;

        while (!allTerminated) {
            allTerminated = true;

            for (Thread t : threads) {
                Thread.State state = t.getState();
                LocalTime time = LocalTime.now();

                stateHistory
                        .computeIfAbsent(t.getName(), k -> new HashSet<>())
                        .add(state);

                System.out.println("[Monitor] " + t.getName() +
                        " is in " + state +
                        " state at " + time);

                if (state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }

            try {
                Thread.sleep(500); // check every 500ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Summary
        System.out.println("\nSummary:");
        for (String name : stateHistory.keySet()) {
            System.out.println(name + " went through " +
                    stateHistory.get(name).size() + " states");
        }
    }
}

