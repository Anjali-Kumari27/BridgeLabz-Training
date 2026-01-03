package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

public class SocialMediaNode {
	
	int userID;
	String name;
	int age;
	FriendNode friendHead; // head of this user's friend list
	SocialMediaNode next; // next user in the platform
	
	public SocialMediaNode(int userID , String name, int age) {
		this.userID = userID;
		this.name = name;
		this.age = age;
		this.friendHead = null; // initially no friends
		this.next = null; 
	}

}
