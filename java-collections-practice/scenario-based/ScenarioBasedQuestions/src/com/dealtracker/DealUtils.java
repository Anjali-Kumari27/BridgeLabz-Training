package com.dealtracker;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

public class DealUtils {

    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    // Regex patterns
    static Pattern dealCodePattern = Pattern.compile("^DealCode:\\s*(.*)$");
    static Pattern validTillPattern = Pattern.compile("^ValidTill:\\s*(\\d{2}-\\d{2}-\\d{4})$");
    static Pattern discountPattern = Pattern.compile("^Discount:\\s*(\\d+)%$");
    static Pattern minPurchasePattern = Pattern.compile("^MinimumPurchase:\\s*(\\d+)$");

    // Read deals from folder
    public static List<Deal> readDeals(String folderPath) {
        List<Deal> deals = new ArrayList<>();
        File folder = new File(folderPath);
        if (!folder.exists() || !folder.isDirectory()) return deals;

        File[] files = folder.listFiles((f) -> f.getName().endsWith(".txt"));
        if (files == null) return deals;

        for (File file : files) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
                String line, dealCode = "", dateStr = "", discountStr = "", minPurchaseStr = "";
                while ((line = br.readLine()) != null) {
                    Matcher m;
                    m = dealCodePattern.matcher(line); if (m.find()) dealCode = m.group(1);
                    m = validTillPattern.matcher(line); if (m.find()) dateStr = m.group(1);
                    m = discountPattern.matcher(line); if (m.find()) discountStr = m.group(1);
                    m = minPurchasePattern.matcher(line); if (m.find()) minPurchaseStr = m.group(1);
                }

                // Skip invalid entries
                if (dealCode.isEmpty() || dateStr.isEmpty() || discountStr.isEmpty() || minPurchaseStr.isEmpty()) {
                    System.out.println("Skipped " + file.getName() + " due to missing fields.");
                    continue;
                }

                LocalDate validTill = LocalDate.parse(dateStr, dtf);
                int discount = Integer.parseInt(discountStr);
                int minPurchase = Integer.parseInt(minPurchaseStr);

                // Skip expired deals
                if (validTill.isBefore(LocalDate.now())) {
                    System.out.println("Skipped " + dealCode + " (expired).");
                    continue;
                }

                deals.add(new Deal(dealCode, validTill, discount, minPurchase));

            } catch (Exception e) {
                System.out.println("Skipped " + file.getName() + " due to error.");
            }
        }
        return deals;
    }

    // Remove duplicates by dealCode
    public static Set<String> getUniqueDealCodes(List<Deal> deals) {
        Set<String> codes = new HashSet<>();
        for (Deal d : deals) codes.add(d.dealCode);
        return codes;
    }

    // Sort deals by discount descending
    public static List<Deal> sortByDiscount(List<Deal> deals) {
        deals.sort((d1, d2) -> d2.discount - d1.discount);
        return deals;
    }
}
