package com.streams.readlargefile;

import java.io.*;

public class ErrorFileReader {

    public void readErrorLines(String filePath) {

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Case-insensitive check
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("File reading error!");
        }
    }
}

