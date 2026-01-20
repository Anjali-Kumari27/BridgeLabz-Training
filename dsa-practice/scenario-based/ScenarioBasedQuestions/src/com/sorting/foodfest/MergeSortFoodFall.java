package com.sorting.foodfest;

public class MergeSortFoodFall {

	    // Merge two sorted arrays
	    public int[] merge(int[] a, int[] b) {

	        int[] result = new int[a.length + b.length];
	        int i = 0, j = 0, k = 0;

	        while (i < a.length && j < b.length) {
	            if (a[i] <= b[j]) {   // stability maintained
	                result[k++] = a[i++];
	            } else {
	                result[k++] = b[j++];
	            }
	        }

	        while (i < a.length) {
	            result[k++] = a[i++];
	        }

	        while (j < b.length) {
	            result[k++] = b[j++];
	        }

	        return result;
	    }
	}
