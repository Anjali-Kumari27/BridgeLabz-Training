package com.smartcheckout;

import java.util.HashMap;

//Manages item price and stock
public class ItemStore {

 HashMap<String, Integer> priceMap = new HashMap<>();
 HashMap<String, Integer> stockMap = new HashMap<>();

 //list of item in the store
 public ItemStore() {
     priceMap.put("Milk", 50);
     priceMap.put("Bread", 40);
     priceMap.put("Rice", 60);
     priceMap.put("Mango", 80);
     priceMap.put("Biscuit", 35);
     priceMap.put("Spices", 60);
     priceMap.put("Kurkure", 20);
     priceMap.put("Coke", 20);

     stockMap.put("Milk", 10);
     stockMap.put("Bread", 5);
     stockMap.put("Rice", 8);
     stockMap.put("Mango", 2);
     stockMap.put("Biscuit", 4);
     stockMap.put("Spices", 6);
     stockMap.put("Kurkure", 10);
     stockMap.put("Coke", 5);
     
 }
 
 private String getActualItemName(String inputItem) {
     for (String item : priceMap.keySet()) {
    	 
    	 //ignore the case of item name and treat as same 
         if (item.equalsIgnoreCase(inputItem)) {
             return item; // original key
         }
     }
     return null;
 }
 
 //displays list of available items
 public void displayAvailableItems() {
     System.out.println("\n-----------------------------------------------------------------");
     System.out.println("                      Available Items in Store                     ");
     System.out.println("-----------------------------------------------------------------\n");
     for (String item : priceMap.keySet()) {
         System.out.println(
             item + " | Price: INR " + priceMap.get(item) +
             " | Stock: " + stockMap.get(item)
         );
     }
 }
 
 //getter method for price of an item
 public int getPrice(String inputItem) {
	 String item = getActualItemName(inputItem);
     return priceMap.get(item);
 }

 //check item is available or not
 public boolean isAvailable(String inputItem) {
	 String item = getActualItemName(inputItem);
     return stockMap.containsKey(item) && stockMap.get(item) > 0;
 }

 //update stock after every billing
 public void reduceStock(String inputItem) {
	 String item = getActualItemName(inputItem);
     stockMap.put(item, stockMap.get(item) - 1);
 }
}
