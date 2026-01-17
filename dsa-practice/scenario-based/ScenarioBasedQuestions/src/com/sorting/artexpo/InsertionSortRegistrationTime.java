package com.sorting.artexpo;

/*
 * ArtExpo – Sort Artists by Registration Time (Insertion Sort)
Story: At an art exhibition, artists register throughout the day. The system continuously adds
each entry and maintains a sorted list by registration time for booth assignment. Insertion Sort
fits well due to the incremental nature.
Key Concepts:
● Real-time insertion
● Nearly sorted data
● Time-based ordering
 */

import java.util.Scanner;

public class InsertionSortRegistrationTime {
	
	public static void insertionSort(int[] registerationTime) {
		for(int i = 1; i < registerationTime.length ; i++) {
			int key = registerationTime[i];
			
			int j = i-1;
			
			while(j>=0 && registerationTime[j]>key) {
				registerationTime[j+1] = registerationTime[j];
				j--;
			}
			
			registerationTime[j+1]= key;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n=====================================================================");
        System.out.println("                   ArtExpo Registeration Time List                     ");
        System.out.println("=====================================================================\n");
        
        System.out.print("Enter number of Artists : ");
        int artist = input.nextInt();
        
        int[] registerationTime = new int[artist];
        
        System.out.println("\n----------------------------------------------------------------------");
        System.out.println("Enter Registeration Time of each Artists (In 24 hour format i.e hh:mm) ");
        System.out.println("----------------------------------------------------------------------\n");
        for(int i=0; i < artist; i++) {
        	System.out.print("Registeration Time of Artist " + (i+1) + " is : ");
        	registerationTime[i] = input.nextInt();
        }
        
        insertionSort(registerationTime);
        
        System.out.println("\n===============================================================");
        System.out.println("             Sorted Artists Based on Registeration Time          ");
        System.out.println("===============================================================\n");
        
        for(int time : registerationTime) {
        	System.out.println(time);
        }
        
        input.close();
	}
}
