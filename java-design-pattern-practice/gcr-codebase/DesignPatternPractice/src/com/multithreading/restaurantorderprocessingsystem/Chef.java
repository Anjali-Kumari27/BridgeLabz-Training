package com.multithreading.restaurantorderprocessingsystem;

public class Chef extends Thread {

    private String dishName;
    private int totalTime; // in milliseconds

    public Chef(String chefName, String dishName, int totalTime) {
        this.setName(chefName);
        this.dishName = dishName;
        this.totalTime = totalTime;
    }

    @Override
    public void run() {

        System.out.println(getName() + " started preparing " + dishName);

        int stepTime = totalTime / 4; // 25% steps

        try {
            Thread.sleep(stepTime);
            System.out.println(getName() + " preparing " + dishName + ": 25% complete");

            Thread.sleep(stepTime);
            System.out.println(getName() + " preparing " + dishName + ": 50% complete");

            Thread.sleep(stepTime);
            System.out.println(getName() + " preparing " + dishName + ": 75% complete");

            Thread.sleep(stepTime);
            System.out.println(getName() + " preparing " + dishName + ": 100% complete");

            System.out.println(getName() + " completed " + dishName);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

