package com.runtimeanalysis;

import java.util.Scanner;


public class ConcatenationPerformance {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // for input to test different scales (e.g., 1000, 10000, 1000000)
        System.out.print("Enter the number of operations (N): ");
        int n = scanner.nextInt();


        // 1. Testing String Concatenation (O(N^2))
        // Best Practice: Avoid using String concatenation in large loops
        if (n <= 10000) {
            long startTime = System.nanoTime();
            String str = "";
            for (int i = 0; i < n; i++) {
                str += "a";
            }
            long endTime = System.nanoTime();
            System.out.println("String Concatenation Time: " + (endTime - startTime) / 1000000.0 + " ms");
        } else {
            System.out.println("String Concatenation: Skipped (Unusable for N > 10,000 due to O(N^2) complexity)");
        }


        // 2. Testing StringBuilder (O(N))
        // Best Practice: Preferred for single-threaded mutable string operations
        long startSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        long endSB = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endSB - startSB) / 1000000.0 + " ms");


        // 3. Testing StringBuffer (O(N))
        // Best Practice: Use only when thread-safety is required
        long startSBuf = System.nanoTime();
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sBuffer.append("a");
        }
        long endSBuf = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endSBuf - startSBuf) / 1000000.0 + " ms");


        scanner.close();
    }
}
