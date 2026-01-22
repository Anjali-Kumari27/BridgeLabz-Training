package com.streams.filehandling;

import java.io.*;

public class ReadWriteTextFile {

    public static void main(String[] args) {

        // Source and destination file names
        String sourceFile = "C:\\Users\\91743\\OneDrive\\Desktop\\source.txt";
        String destinationFile = "C:\\Users\\91743\\OneDrive\\Desktop\\destination.txt";

        // Try-with-resources ensures files are closed automatically
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int data;

            // Read one byte at a time until end of file
            while ((data = fis.read()) != -1) {
                fos.write(data); // Write byte to destination file
            }

            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            // If source file does not exist
            System.out.println("Source file not found!");
        } catch (IOException e) {
            // For any other input/output error
            System.out.println("Error while reading or writing file.");
        }
    }
}
