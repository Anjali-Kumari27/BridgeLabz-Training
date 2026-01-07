package com.challengeproblem;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class StringInputStream {

	// Method to compare StringBuilder and StringBuffer
    public static void runStringBenchmark(int iterations) {
        String testStr = "hello";

        // StringBuilder Benchmark
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(testStr);
        }
        long endBuilder = System.nanoTime();

        // StringBuffer Benchmark
        long startBuffer = System.nanoTime();
        StringBuffer sBuf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sBuf.append(testStr);
        }
        long endBuffer = System.nanoTime();

        System.out.println("StringBuilder: " + (endBuilder - startBuilder) / 1000000 + " ms");
        System.out.println("StringBuffer: " + (endBuffer - startBuffer) / 1000000 + " ms");
    }

    // Method to compare FileReader and InputStreamReader word counting
    public static void runFileBenchmark(String path) {
        // Benchmark using FileReader
        long startFR = System.nanoTime();
        
        long wordCountFR = countWordsWithFileReader(path);
        long endFR = System.nanoTime();

        // Benchmark using InputStreamReader
        long startISR = System.nanoTime();
        
        long wordCountISR = countWordsWithISR(path);
        long endISR = System.nanoTime();

        System.out.println("FileReader Word Count: " + wordCountFR + " | Time: " + (endFR - startFR) / 1000000 + " ms");
        System.out.println("InputStreamReader Word Count: " + wordCountISR + " | Time: " + (endISR - startISR) / 1000000 + " ms");
    }

    // Word count logic using FileReader wrapped in BufferedReader
    public static long countWordsWithFileReader(String path) {
        long count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    count += line.split("\\s+").length;
                }
            }
        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }
        return count;
    }

    // Word count logic using InputStreamReader wrapped in BufferedReader
    public static long countWordsWithISR(String path) {
    	
        long count = 0;
        
        // Specifying UTF-8 charset as per best practices for InputStreamReader
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {
        	
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    count += line.split("\\s+").length;
                }
            }
        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }
        return count;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- PART 1: StringBuilder vs StringBuffer ---
        System.out.println("--- Part 1: String Manipulation (1,000,000 iterations) ---");
        runStringBenchmark(1000000);

        // --- PART 2: FileReader vs InputStreamReader ---
        System.out.println("\n--- Part 2: File Reading Performance ---");
        System.out.print("Enter the path to a large file (e.g., 100MB file): ");
        String filePath = input.nextLine();

        runFileBenchmark(filePath);

        input.close();
    }

    
}
