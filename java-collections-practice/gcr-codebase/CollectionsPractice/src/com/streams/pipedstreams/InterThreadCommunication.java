package com.streams.pipedstreams;

import java.io.*;

public class InterThreadCommunication {

    public static void main(String[] args) {

        try {
            // Create piped streams
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            // Create threads
            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);

            // Start threads
            writer.start();
            reader.start();

        } catch (IOException e) {
            System.out.println("Pipe connection error.");
        }
    }
}
