package com.sorting.foodfest;

/*
 * 7. FoodFest – Sorting Stalls by Customer Footfall (Merge Sort)
Story: At a multi-day food festival, organizers track footfall at every stall each day. They collect
daily logs from all zones (already sorted by count), and use Merge Sort to combine zone-wise
data into a master list for performance evaluation.
Concepts Involved:
● Merge Sort
● Combining multiple sorted datasets
● Stability in data with equal values
 */
import java.util.Scanner;

public class UseFoodFest{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n==========================================================");
        System.out.println("         FoodFest – Stall Footfall Sorting (Merge)          ");
        System.out.println("==========================================================\n");

        System.out.print("Enter number of zones: ");
        int zones = input.nextInt();

        ZoneData[] zoneData = new ZoneData[zones];

        // Taking input for each zone
        for (int z = 0; z < zones; z++) {

            System.out.print("\nEnter number of stalls in Zone " + (z + 1) + ": ");
            int n = input.nextInt();

            int[] footfall = new int[n];

            System.out.println("Enter sorted footfall counts for Zone " + (z + 1) + ":");
            for (int i = 0; i < n; i++) {
                footfall[i] = input.nextInt();
            }

            zoneData[z] = new ZoneData(footfall);
        }

        // Merge all zones
        MergeSortFoodFall manager = new MergeSortFoodFall();
        int[] mergedResult = zoneData[0].getFootfall();

        for (int i = 1; i < zones; i++) {
            mergedResult = manager.merge(mergedResult, zoneData[i].getFootfall());
        }

        
        System.out.println("\n-----------------------------------------------");
        System.out.println("          Final Master Footfall List           ");
        System.out.println("-----------------------------------------------\n");

        for (int value : mergedResult) {
            System.out.print(value + " ");
        }

        input.close();
    }
}
