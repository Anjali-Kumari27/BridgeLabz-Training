package com.coderepocleaner;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class CodeScanner {

    // Scan all .java files from root folder
    public static List<Path> scanJavaFiles(String rootFolder)
            throws IOException {

        List<Path> javaFiles = new ArrayList<>();
        Path path = Paths.get(rootFolder);

        if (!Files.exists(path)) {
            System.out.println("Folder not found: " + rootFolder);
            return javaFiles;
        }
        
        Files.walk(path)
        .filter(p -> p.toString().endsWith(".java"))
        .forEach(javaFiles::add);

        return javaFiles;
    }
}
