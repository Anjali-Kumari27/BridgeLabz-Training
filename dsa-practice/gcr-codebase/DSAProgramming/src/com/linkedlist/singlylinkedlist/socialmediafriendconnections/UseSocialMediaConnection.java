package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

public class UseSocialMediaConnection {
	
	public static void main(String[] args) {

	    SocialMediaLinkedList social = new SocialMediaLinkedList();

	    System.out.println("\n====================== Adding Users =====================\n");
	    social.addUser(101, "Anjali", 22);
	    social.addUser(102, "Riya", 21);
	    social.addUser(103, "Rahul", 24);
	    social.addUser(104, "Devika", 23);

	    System.out.println("\n================= Adding Friend Connections =================");
	    social.addFriendConnection(101, 102);
	    social.addFriendConnection(101, 103);
	    social.addFriendConnection(102, 103);
	    social.addFriendConnection(102, 104);

	    System.out.println("\n------------------------------------------------------------\n");
	    social.displayFriends(101);

	    System.out.println("\n------------------------------------------------------------\n");
	    System.out.println("Searching user by name:");
	    social.searchByName("Riya");

	    System.out.println("\n------------------------------------------------------------\n");
	    System.out.println("Mutual Friends between 101 and 102:");
	    social.findMutualFriends(101, 102);

	    System.out.println("\n------------------------------------------------------------\n");
	    System.out.println("Friend count for each user:\n");
	    social.countFriends();

	    System.out.println("\n------------------------------------------------------------\n");
	    System.out.println("Removing friend connection between 101 and 102:");
	    social.removeFriendConnection(101, 102);

	    System.out.println("\n\n================= Final Friends List =================\n");
	    social.displayFriends(101);
	}


}
