package com.streams.pipedstreams;

import java.io.*;

public class WriterThread extends Thread {

    private PipedOutputStream pos;

    // Constructor
    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from Writer Thread";
            pos.write(message.getBytes());
            pos.close();
        } catch (IOException e) {
            System.out.println("Error in writer thread.");
        }
    }
}

