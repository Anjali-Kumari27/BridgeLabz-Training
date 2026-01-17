package com.sorting.fleetmanager;

/*
 * FleetManager – Vehicle Maintenance Scheduler (Merge Sort)
Story: A fleet company schedules vehicle maintenance based on mileage. Each depot sends a
sorted list of vehicles. To create a master schedule, Merge Sort is used to combine these depot
lists efficiently.
Key Concepts:
● Sorted sublists from multiple sources
● Merge sort for final master list
● Efficient memory usage for large lists
 */

import java.util.Scanner;
public class MergeSortVehicleMaintenance {
	
	public static void mergeSort(int[] mileage, int left, int right) {
		if(left < right) {
		int mid = (left+right)/2;
		
		mergeSort(mileage, left, mid);
		mergeSort(mileage, mid+1, right);
		merge(mileage, left, mid, right);
		}
	}

	public static void merge(int[] mileage, int left, int mid, int right) {
		int size = right - left + 1;
		
		int[] temp = new int[size];
		
		int i = left;
		int j = mid+1;
		int k = 0;
		
		while(i<=mid && j<=right) {
			if(mileage[i] >= mileage[j]) {
				temp[k++] = mileage[i++];
			}
			else {
				temp[k++] = mileage[j++];
			}
		}
		
		while(i <= mid) {
			temp[k++] = mileage[i++];
		}
		
		while(j <= right) {
			temp[k++] = mileage[j++];
		}
		
		for(int x=0; x<size; x++) {
			mileage[left + x] = temp[x];
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n===============================================================");
        System.out.println("                 Vehicle Maintenance Scheduler                   ");
        System.out.println("===============================================================\n");
        
        System.out.print("Enter number of Vehicles : ");
        int vehicle = input.nextInt();
        
        int[] mileage = new int[vehicle];
        
        System.out.println("\n*****************************");
        System.out.println("Enter mileage of each Vehicle");
        System.out.println("*****************************\n");
        for(int i = 0; i < vehicle; i++) {
        	System.out.print("Mileage of Vehicle " + (i+1) + " is : ");
        	mileage[i] = input.nextInt();
        }
        
        mergeSort(mileage, 0, vehicle-1);
        
        System.out.println("\n===========================================================================");
        System.out.println("                Sorted Vehicle based on Mileage (High to Low)                ");
        System.out.println("===========================================================================\n");
        
        for(int i = 0; i < vehicle; i++) {
        	System.out.println("Vehicle " + (i+1) + " : " + mileage[i]);
        }
        
        input.close();
	}
}
