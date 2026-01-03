package com.linkedlist.doublylinkedlist.undoredofunctionality;

public class UndoRedoLinkedList {

	    // First text state
	    private UndoRedoNode head;
	    
	    // Last text state
	    private UndoRedoNode tail;
	    
	    // Current state user is viewing
	    private UndoRedoNode current;
	    
	    // Number of states stored
	    private int size;
	    
	    // Maximum states to keep
	    private final int MAX_HISTORY = 10;

	    // Add new text state
	    public void addState(String newText) {

	    	UndoRedoNode node = new UndoRedoNode(newText);

	        // If undo was used, remove redo history
	        if (current != null && current.next != null) {
	            current.next.prev = null;
	            current.next = null;
	            tail = current;
	            size = countNodes();
	        }

	        // Add new state to end
	        if (head == null) {
	            head = tail = current = node;
	            size = 1;
	        } else {
	            tail.next = node;
	            node.prev = tail;
	            tail = node;
	            current = node;
	            size++;
	        }

	        //Limit history to last 10 states
	        if (size > MAX_HISTORY) {
	            head = head.next;
	            head.prev = null;
	            size--;
	        }

	        System.out.println("Text Added:");
	        displayCurrentState();
	    }

	    // Undo operation (go back one state)
	    public void undo() {
	        if (current == null || current.prev == null) {
	            System.out.println("Nothing to undo");
	            return;
	        }

	        current = current.prev;
	        System.out.println("\nUndo Performed:");
	        displayCurrentState();
	    }

	    // Redo operation (go forward one state)
	    public void redo() {
	        if (current == null || current.next == null) {
	            System.out.println("Nothing to redo");
	            return;
	        }

	        current = current.next;
	        System.out.println("\nRedo Performed:");
	        displayCurrentState();
	    }

	    // Display current text state
	    public void displayCurrentState() {
	        System.out.println("----------------------------------------");
	        System.out.println("Current Text:");
	        System.out.println(current != null ? current.text : "Empty");
	        System.out.println("   ");
	    }

	    //method to count nodes (text states) in the list
	    private int countNodes() {
	        int count = 0;
	        UndoRedoNode temp = head;
	        while (temp != null) {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	    }
}
