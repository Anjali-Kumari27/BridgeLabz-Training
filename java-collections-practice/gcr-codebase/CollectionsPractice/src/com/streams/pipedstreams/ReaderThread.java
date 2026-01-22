package com.streams.pipedstreams;

import java.io.*;

public class ReaderThread extends Thread {

    private PipedInputStream pis;

    // Constructor
    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try {
            int data;
            while ((data = pis.read()) != -1) {
                System.out.print((char) data);
            }
            pis.close();
        } catch (IOException e) {
            System.out.println("Error in reader thread.");
        }
    }
}
