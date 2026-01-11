package com.browserbuddy;

/*
 * TabHistory manages browsing history
 * using Doubly Linked List
 */
public class TabHistory {

	PageNode head;        // First page
	PageNode current;     // Current page

 public TabHistory() {
     head = null;
     current = null;
 }

 // method to Visit a new page
 public void visitPage(String url) {

	 PageNode newNode = new PageNode(url);

	 // If no page is opened yet
     if (head == null) {
         head = newNode;
         current = newNode;
     } else {
         // Remove forward history
         current.next = null;

         //connect new page
         newNode.prev = current;
         current.next = newNode;
         current = newNode;
     }

     System.out.println("Visited: " + url);
 }

 // Go back to previous page
 public void goBack() {
     if (current != null && current.prev != null) {
         current = current.prev;
         System.out.println("Back to: " + current.url);
     } else {
         System.out.println("No previous page.");
     }
 }

 // Go forward to next page
 public void goForward() {
     if (current != null && current.next != null) {
         current = current.next;
         System.out.println("Forward to: " + current.url);
     } else {
         System.out.println("No next page.");
     }
 }

 // Show current page
 public void showCurrentPage() {
     if (current != null) {
         System.out.println("Current Page: " + current.url);
     } else {
         System.out.println("No page open.");
     }
 }

 // Show complete browsing history
 public void showHistory() {

     if (head == null) {
         System.out.println("No browsing history.");
         return;
     }

     System.out.println("\nBrowsing History:");
     PageNode temp = head;

     while (temp != null) {
         if (temp == current) {
             System.out.println("*** " + temp.url + " (Current)");
         } else {
             System.out.println("   " + temp.url);
         }
         temp = temp.next;
     }
 }
}
