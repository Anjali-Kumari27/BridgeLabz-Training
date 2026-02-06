package com.multithreading.downloadmanager;

import java.util.Random;

public class FileDownloaderRunnable implements Runnable {

    private String fileName;
    private Random random = new Random();

    public FileDownloaderRunnable(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {

        for (int progress = 0; progress <= 100; progress += 25) {

            System.out.println("[" + Thread.currentThread().getName() +
                    "] Downloading " + fileName + ": " + progress + "%");

            try {
                Thread.sleep(500 + random.nextInt(500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
