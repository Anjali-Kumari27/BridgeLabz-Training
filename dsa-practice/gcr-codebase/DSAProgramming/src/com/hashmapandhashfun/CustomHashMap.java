package com.hashmapandhashfun;

import java.util.*;

public class CustomHashMap {
	
	    // A simple node class to store key-value pairs
	    public class Node {
	    	
	    	// key
	        String key;
	        
	        // value
	        int value;
	        
	        Node(String k, int v) 
	        {
	        	key = k; value = v; 
	        }
	    }

	    // Array of LinkedLists (buckets)
	    private LinkedList<Node>[] buckets;
	    
	    // Total number of buckets
	    private int size = 10;

	    // Constructor to initialize buckets
	    public CustomHashMap() {
	        buckets = new LinkedList[size];
	        
	        // Initialize each bucket as an empty LinkedList
	        for (int i = 0; i < size; i++)
	        {
	        	buckets[i] = new LinkedList<>();
	        }
	    }


	    // Hash function to calculate bucket index
	    private int getIndex(String key) {
	        return Math.abs(key.hashCode()) % size;
	    }

	    // Method to insert or update a key-value pair
	    public void put(String key, int value) {
	    	
	    	// Find bucket index using hash function
	        int idx = getIndex(key);
	        
	        // Check if key already exists
	        for (Node node : buckets[idx]) {
	            if (node.key.equals(key)) {
	                node.value = value; // Update value
	                return;
	            }
	        }
	        
	        // If key not found, add new node
	        buckets[idx].add(new Node(key, value)); 
	    }

	    // Method to get value for a given key
	    public int get(String key) {
	    	
	    	// Find bucket index
	        int idx = getIndex(key);
	        
	        // Search key in the bucket
	        for (Node node : buckets[idx]) {
	            if (node.key.equals(key)) {
	            	
	            	// Return value if found
	            	return node.value;
	            }
	        }
	        return -1; // return -1 if key Not found
	    }


	    public static void main(String[] args) {
	    	
	    	// Create CustomHashMap object
	    	CustomHashMap map = new CustomHashMap();
	    	
	        Scanner input = new Scanner(System.in);

	        // Add sample data
	        System.out.println("Adding test data (Apple: 10, Banana: 20)...");
	        map.put("Apple", 10);
	        map.put("Banana", 20);

	        // Taking key input from user
	        System.out.println("Enter a key to search:");
	        String key = input.next();
	        
	        // Print value for the entered key
	        System.out.println("Value: " + map.get(key));
	        
	        input.close();
	    }
}
