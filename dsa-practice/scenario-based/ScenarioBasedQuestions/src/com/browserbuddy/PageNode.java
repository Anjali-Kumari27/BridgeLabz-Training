package com.browserbuddy;

/*
 * PageNode represents a single web page
 * in the browsing history
 */

public class PageNode {

 String url;           // Page URL
 PageNode prev;        // points to Previous page
 PageNode next;        // points to Next page

 // Constructor to initialize url
 public PageNode(String url) {
     this.url = url;
     this.prev = null;
     this.next = null;
 }
}
