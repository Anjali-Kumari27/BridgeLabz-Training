package com.variousinterfaces.additionalquestion.shoppingcart;

import java.util.*;

public class CartManager {

    // Stores product prices (fast access)
    HashMap<String, Double> hashMap = new HashMap<>();

    // Maintains insertion order
    LinkedHashMap<String, Double> linkedHashMap = new LinkedHashMap<>();

    // Stores products sorted by price
    TreeMap<Double, String> treeMap = new TreeMap<>();

    // Add product to cart
    void addProduct(String name, double price) {

        hashMap.put(name, price);
        linkedHashMap.put(name, price);
        treeMap.put(price, name);
    }

    // Display products from HashMap
    void showHashMapItems() {
        System.out.println("Products (HashMap):");
        for (String key : hashMap.keySet()) {
            System.out.println(key + " => " + hashMap.get(key));
        }
    }

    // Display products in insertion order
    void showLinkedHashMapItems() {
        System.out.println("Products (LinkedHashMap - Insertion Order):");
        for (String key : linkedHashMap.keySet()) {
            System.out.println(key + " => " + linkedHashMap.get(key));
        }
    }

    // Display products sorted by price
    void showTreeMapItems() {
        System.out.println("Products (TreeMap - Sorted by Price):");
        for (Double price : treeMap.keySet()) {
            System.out.println(treeMap.get(price) + " => " + price);
        }
    }
}

