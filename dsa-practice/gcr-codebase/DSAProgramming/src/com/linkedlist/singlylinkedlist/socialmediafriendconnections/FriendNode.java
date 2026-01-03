package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

public class FriendNode {
	
	// Stores the ID of the friend
	int friendID;
	
	// Points to the next friend in the friend list
	FriendNode next;
	
	
	// Constructor to create a new friend node
	public FriendNode(int friendID) {
		this.friendID = friendID;
		this.next = null; // Next friend is initially null (no next friend yet)
	}

}
