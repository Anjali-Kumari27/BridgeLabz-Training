package com.csv.jsontocsvviceversa;
import java.io.*;
import java.util.*;

public class JsonToCSVConverter {

    // Convert JSON to CSV
    public static void jsonToCsv(String jsonFilePath, String csvFilePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(jsonFilePath));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) sb.append(line.trim());
        br.close();

        // Remove [ ] and split by "},{" to get objects
        String jsonContent = sb.toString();
        jsonContent = jsonContent.substring(1, jsonContent.length() - 1); // remove [ ]
        String[] objects = jsonContent.split("\\},\\{");

        List<Map<String, String>> list = new ArrayList<>();
        Set<String> headersSet = new LinkedHashSet<>();

        for (String obj : objects) {
            obj = obj.replace("{", "").replace("}", ""); // remove braces
            String[] pairs = obj.split(",");
            Map<String, String> map = new LinkedHashMap<>();
            for (String pair : pairs) {
                String[] keyValue = pair.split(":");
                String key = keyValue[0].replace("\"", "").trim();
                String value = keyValue[1].replace("\"", "").trim();
                map.put(key, value);
                headersSet.add(key);
            }
            list.add(map);
        }

        // Write CSV
        BufferedWriter bw = new BufferedWriter(new FileWriter(csvFilePath));
        List<String> headers = new ArrayList<>(headersSet);
        bw.write(String.join(",", headers));
        bw.newLine();

        for (Map<String, String> map : list) {
            List<String> row = new ArrayList<>();
            for (String header : headers) row.add(map.get(header));
            bw.write(String.join(",", row));
            bw.newLine();
        }

        bw.close();
        System.out.println("JSON converted to CSV successfully!");
    }

    // Convert CSV to JSON
    public static void csvToJson(String csvFilePath, String jsonFilePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(csvFilePath));
        String headerLine = br.readLine();
        if (headerLine == null) return;

        String[] headers = headerLine.split(",");
        List<Map<String, String>> list = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            Map<String, String> map = new LinkedHashMap<>();
            for (int i = 0; i < headers.length; i++) map.put(headers[i], values[i]);
            list.add(map);
        }
        br.close();

        // Write JSON
        BufferedWriter bw = new BufferedWriter(new FileWriter(jsonFilePath));
        bw.write("[\n");
        for (int i = 0; i < list.size(); i++) {
            Map<String, String> map = list.get(i);
            bw.write("  {");
            int j = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bw.write("\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"");
                if (j < map.size() - 1) bw.write(",");
                j++;
            }
            bw.write("}");
            if (i < list.size() - 1) bw.write(",");
            bw.newLine();
        }
        bw.write("]");
        bw.close();

        System.out.println("CSV converted back to JSON successfully!");
    }

    public static void main(String[] args) {
        String jsonFile = "students.json";
        String csvFile = "students.csv";
        String jsonOutputFile = "students_from_csv.json";

        try {
            jsonToCsv(jsonFile, csvFile);
            csvToJson(csvFile, jsonOutputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
