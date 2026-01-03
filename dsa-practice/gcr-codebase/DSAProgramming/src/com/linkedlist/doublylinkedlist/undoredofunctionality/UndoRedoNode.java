package com.linkedlist.doublylinkedlist.undoredofunctionality;

public class UndoRedoNode {
	
	String text;
	UndoRedoNode next, prev;
	
	UndoRedoNode(String text){
		
		this.text = text;
		this.next = this.prev = null;
	}

}
