package com.csv.mergetwocsv;

import java.io.*;
import java.util.*;

public class MergeCSVFiles {

    public static void main(String[] args) {

        String file1 = "C:\\Users\\91743\\OneDrive\\Desktop\\student1.csv";
        String file2 = "C:\\Users\\91743\\OneDrive\\Desktop\\student2.csv";
        String outputFile = "C:\\Users\\91743\\OneDrive\\Desktop\\merged.csv";

        // Maps to store CSV data based on ID
        Map<String, String[]> map1 = new HashMap<>();
        Map<String, String[]> map2 = new HashMap<>();
        Set<String> allIds = new TreeSet<>(); // to keep IDs sorted

        // Read students1.csv
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            String line;
            boolean isHeader = true;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                if (isHeader) { isHeader = false; continue; }

                String[] data = line.split(",", -1);
                String id = data[0].trim();
                map1.put(id, data);
                allIds.add(id);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read students2.csv
        try (BufferedReader br = new BufferedReader(new FileReader(file2))) {
            String line;
            boolean isHeader = true;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                if (isHeader) { isHeader = false; continue; }

                String[] data = line.split(",", -1);
                String id = data[0].trim();
                map2.put(id, data);
                allIds.add(id);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write merged CSV
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            // Header
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            for (String id : allIds) {
                String[] data1 = map1.getOrDefault(id, new String[]{"", "", ""});
                String[] data2 = map2.getOrDefault(id, new String[]{"", "", ""});

                String name = data1.length > 1 ? data1[1] : "";
                String age = data1.length > 2 ? data1[2] : "";
                String marks = data2.length > 1 ? data2[1] : "";
                String grade = data2.length > 2 ? data2[2] : "";

                bw.write(id + "," + name + "," + age + "," + marks + "," + grade);
                bw.newLine();
            }

            System.out.println("CSV files merged successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

