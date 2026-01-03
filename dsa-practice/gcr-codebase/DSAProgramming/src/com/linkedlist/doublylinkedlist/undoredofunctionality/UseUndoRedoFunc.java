package com.linkedlist.doublylinkedlist.undoredofunctionality;

public class UseUndoRedoFunc {
	public static void main(String[] args) {

		// Create a text editor with undo/redo functionality
		UndoRedoLinkedList editor = new UndoRedoLinkedList();

        System.out.println("=========== TEXT EDITOR STARTED ===========\n");

        // Add initial text states
        editor.addState("Hello");                               //State 1
        editor.addState("Hello Anjali");                       //State 2
        editor.addState("Hello Anjali!");                     //State 3
        editor.addState("Hello Anjali! Welcome");            //State 4
        editor.addState("Hello Anjali! Welcome to OTA");    //State 5

        System.out.println("\n=========== UNDO OPERATIONS ===========");
        // Undo last two changes
        editor.undo(); // Back to State 4
        editor.undo(); // Back to State 3

        System.out.println("\n=========== REDO OPERATIONS ===========");
        // Redo last undone change
        // Forward to State 4
        editor.redo(); 

        System.out.println("\n=========== ADDING NEW TEXT AFTER UNDO ===========\n");
        
        // Add new text after undo, which clears future redo history
        editor.addState("Hello Gentlewoman Cadet");   // New State 5

        System.out.println("\n=========== TRY REDO (Should Fail) ===========\n");
        
        // Attempt redo, but it should fail since redo history was cleared
        editor.redo();
    }

}
