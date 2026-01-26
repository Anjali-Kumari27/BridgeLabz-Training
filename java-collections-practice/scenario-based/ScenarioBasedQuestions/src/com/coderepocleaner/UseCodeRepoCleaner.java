package com.coderepocleaner;

import java.io.File;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.*;

public class UseCodeRepoCleaner {

    public static void main(String[] args) {

        String rootFolder = "C:\\Users\\91743\\OneDrive\\Desktop\\javafiles";

        Map<FileType, List<File>> resultMap = new HashMap<>();

        resultMap.put(FileType.VALID, new ArrayList<>());
        resultMap.put(FileType.WARNING, new ArrayList<>());
        resultMap.put(FileType.ERROR, new ArrayList<>());

        try {
            List<Path> javaPaths =
                    CodeScanner.scanJavaFiles(rootFolder);

            // Convert Path → File
            List<File> javaFiles = javaPaths.stream()
                    .map(Path::toFile)
                    .collect(Collectors.toList());

            // Filter files > 1KB using streams
            javaFiles.stream()
                    //.filter(f -> f.length() > 1024)
                    .forEach(file -> {

                        FileType type =
                                CodeAnalyzer.analyzeFile(file);

                        resultMap.get(type).add(file);
                    });

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Display result
        for (FileType type : resultMap.keySet()) {

            System.out.println("\n==============================");
            System.out.println(" " + type + " FILES");
            System.out.println("==============================");

            for (File f : resultMap.get(type)) {
                System.out.println(f.getName());
            }
        }
    }
}
