package com.jsonhandling.iplanalyzer;

import java.io.*;
import java.util.*;

public class CsvCensorProcessor {

    public static void processCsv(String input, String output) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(input));
        BufferedWriter bw = new BufferedWriter(new FileWriter(output));

        String line = br.readLine(); // header
        bw.write(line);
        bw.newLine();

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            data[1] = CensorUtil.maskTeamName(data[1]);
            data[2] = CensorUtil.maskTeamName(data[2]);
            data[5] = CensorUtil.maskTeamName(data[5]);
            data[6] = CensorUtil.redactPlayer();

            bw.write(String.join(",", data));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
