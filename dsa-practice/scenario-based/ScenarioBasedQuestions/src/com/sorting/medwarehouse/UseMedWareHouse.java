package com.sorting.medwarehouse;

/*
 * 10. MedWarehouse – Sorting Medicines by Expiry (Merge Sort)
Story: A pharmaceutical warehouse handles medicine records from multiple branches, each
sending a sorted list by expiry date. To ensure none are wasted, the system uses Merge Sort
to compile all expiry dates and alert if any medicine is nearing expiration.
Concepts Involved:
● Merge Sort
● Sorted sublist merging
● Critical for time-sensitive inventory

 */
import java.util.Scanner;

public class UseMedWareHouse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n=================================================");
        System.out.println("   MedWarehouse – Medicine Expiry Management     ");
        System.out.println("=================================================\n");

        System.out.print("Enter total number of medicines received: ");
        int n = input.nextInt();
        input.nextLine();

        Medicine[] medicines = new Medicine[n];

        // Input medicines (from all branches)
        for (int i = 0; i < n; i++) {
            System.out.print("\nMedicine name: ");
            String name = input.nextLine();

            System.out.print("Days to expiry: ");
            int days = input.nextInt();
            input.nextLine();

            medicines[i] = new Medicine(name, days);
        }

        // Merge Sort
        MergeSortMedWarehouse sorter = new MergeSortMedWarehouse();
        sorter.mergeSort(medicines, 0, n - 1);

        // Output
        System.out.println("\n-----------------------------------------------");
        System.out.println(" Medicines Sorted by Expiry (Urgent First) ");
        System.out.println("-----------------------------------------------");

        for (Medicine m : medicines) {
            System.out.println(m.name + " - Expires in " + m.expiryDays + " days");
        }

        input.close();
    }
}
