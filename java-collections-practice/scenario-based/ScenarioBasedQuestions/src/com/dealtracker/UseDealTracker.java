package com.dealtracker;

/*
 *  DealTracker – E-Commerce Discount Validator
Story: An e-commerce platform is flooded with daily deals, sent in a file like:
DealCode: FLAT50
ValidTill: 15-06-2025
Discount: 50%
MinimumPurchase: 999
The DealTracker tool should:
● Read and parse .txt deal entries using FileInputStream
● Use Regex to extract fields like percentage and date
● Filter expired deals using LocalDate + regex validation
● Store all valid deals in a Map<String, Deal>
● Use a Set to prevent duplicate deal codes
● Allow sorting deals by discount using Comparator
● Use Generics to work with other promotion types: cashback, referral bonus, etc.
 */
import java.util.*;

public class UseDealTracker {

    public static void main(String[] args) {

        String folderPath = "C:/Users/91743/Desktop/deals";

        // Step 1: Read deals from files
        List<Deal> dealList = DealUtils.readDeals(folderPath);

        if (dealList.isEmpty()) {
            System.out.println("No valid deals found.");
            return;
        }

        // Step 2: Remove duplicates
        Set<String> uniqueCodes = DealUtils.getUniqueDealCodes(dealList);

        // Step 3: Store in Promotion
        Promotion<String> discountPromotion = new Promotion<>("Discount");
        for (Deal d : dealList) {
            discountPromotion.addDeal(d.dealCode, d);
        }

        // Step 4: Sort deals by discount
        List<Deal> sortedDeals = DealUtils.sortByDiscount(dealList);

        System.out.println("\n==============================");
        System.out.println(" VALID DEALS ");
        System.out.println("==============================");
        for (Deal d : sortedDeals) {
            System.out.println(d);
        }

        System.out.println("\n==============================");
        System.out.println(" UNIQUE DEAL CODES ");
        System.out.println("==============================");
        uniqueCodes.forEach(System.out::println);
    }
}

