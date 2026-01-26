package com.coderepocleaner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class CodeAnalyzer {

    // Regex rules
    static Pattern badMethodPattern =
            Pattern.compile("void\\s+[A-Z].*\\("); // bad method name

    static Pattern importPattern =
            Pattern.compile("^import\\s+.*;", Pattern.MULTILINE);

    // Analyze a single file
    public static FileType analyzeFile(File file) {

        Set<String> imports = new HashSet<>();
        boolean badMethodFound = false;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {

                // Detect bad method naming
                if (badMethodPattern.matcher(line).find()) {
                    badMethodFound = true;
                }

                // Collect imports
                Matcher m = importPattern.matcher(line);
                if (m.find()) {
                    imports.add(line);
                }
            }

        } catch (Exception e) {
            return FileType.ERROR;
        }

        if (badMethodFound) return FileType.WARNING;
        return FileType.VALID;
    }
}
