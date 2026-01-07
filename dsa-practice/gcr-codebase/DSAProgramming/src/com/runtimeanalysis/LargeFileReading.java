package com.runtimeanalysis;

import java.io.*;
import java.util.Scanner;


public class LargeFileReading {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Input: Path to a large file (e.g., a 500MB test file)
        System.out.print("Enter the path to the large file: ");
        String filePath = input.nextLine();


        // 1. Benchmarking FileReader
        System.out.println("\nTesting FileReader...");
        long startFR = System.nanoTime();
        readFileWithFileReader(filePath);
        long endFR = System.nanoTime();
        System.out.println("FileReader Completion Time: " + (endFR - startFR) / 1_000_000_000.0 + " seconds");


        // 2. Benchmarking InputStreamReader
        System.out.println("\nTesting InputStreamReader...");
        long startISR = System.nanoTime();
        readFileWithInputStreamReader(filePath);
        long endISR = System.nanoTime();
        System.out.println("InputStreamReader Completion Time: " + (endISR - startISR) / 1_000_000_000.0 + " seconds");


        input.close();
    }


    // Method using FileReader: Character Stream approach
    public static void readFileWithFileReader(String path) {
        // Wrapping FileReader in BufferedReader to enhance performance
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while (br.readLine() != null) {
                // Just reading the file without printing to focus on I/O speed
            }
        } catch (IOException e) {
            System.out.println("Error reading with FileReader: " + e.getMessage());
        }
    }


    // Method using InputStreamReader: Byte Stream to Character conversion
    public static void readFileWithInputStreamReader(String path) {
        // Wrapping InputStreamReader in BufferedReader to enhance performance
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            while (br.readLine() != null) {
                // Just reading the file without printing to focus on I/O speed
            }
        } catch (IOException e) {
            System.out.println("Error reading with InputStreamReader: " + e.getMessage());
        }
    }
}
