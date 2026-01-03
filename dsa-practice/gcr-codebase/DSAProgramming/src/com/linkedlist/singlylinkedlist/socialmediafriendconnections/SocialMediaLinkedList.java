package com.linkedlist.singlylinkedlist.socialmediafriendconnections;


public class SocialMediaLinkedList {

	// Head of the user list
    private SocialMediaNode head;

    // 1. Add a new user to the platform
    public void addUser(int userId, String name, int age) {

        SocialMediaNode user = new SocialMediaNode(userId, name, age);

        if (head == null) {
        	
        	// First user
            head = user;
        } 
        else {
            SocialMediaNode temp = head;
            
            while (temp.next != null) {
            	// Go to last user
                temp = temp.next;
            }
            
            // Add at end
            temp.next = user;
        }

        System.out.println("User ID: " + userId + " | Name: " + name  + "   | Age: " + age + "\n");
        System.out.println("(User Added Successfully)\n\n");
    }

    
    // Search User by ID
    public SocialMediaNode searchByUserID(int userID) {
    	SocialMediaNode temp = head;

        while (temp != null) {
            if (temp.userID == userID)
            	
            	// Return if found
                return temp;
            temp = temp.next;
        }
        // Not found
        return null;
    }

    
    // Search User by Name
    public void searchByName(String name) {
    	SocialMediaNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("User not found");
    }

    // Add a friend connection between two users (both ways)
    public void addFriendConnection(int userID1, int userID2) {
        SocialMediaNode user1 = searchByUserID(userID1);
        SocialMediaNode user2 = searchByUserID(userID2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        addFriend(user1, userID2); // Add friend to user1
        addFriend(user2, userID1); // Add friend to user2

        System.out.println("\nFriend connection SUCCESSFUL!");
        System.out.println(user1.name + " and " + user2.name + " are now friends.\n");

        
        displayFriends(userID1);
        displayFriends(userID2);
        System.out.println("  ");
    }

    //add friend to a user's friend list
    private void addFriend(SocialMediaNode user, int friendID) {
        FriendNode friend = new FriendNode(friendID);
        friend.next = user.friendHead;
        user.friendHead = friend;
    }

    // Remove Friend Connection
    public void removeFriendConnection(int userID1, int userID2) {
    	SocialMediaNode user1 = searchByUserID(userID1);
    	SocialMediaNode user2 = searchByUserID(userID2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        removeFriend(user1, userID2);
        removeFriend(user2, userID1);

        System.out.println("Friend connection removed");
    }

    //remove friend from user's friend list
    private void removeFriend(SocialMediaNode user, int friendID) {
        FriendNode temp = user.friendHead;

        if (temp == null)
            return;

        if (temp.friendID == friendID) {
            user.friendHead = temp.next;
            return;
        }

        while (temp.next != null && temp.next.friendID != friendID) {
            temp = temp.next;
        }

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Display Friends of a User
    public void displayFriends(int userID) {
    	SocialMediaNode user = searchByUserID(userID);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        FriendNode temp = user.friendHead;

        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.println("( Friend ID: " + temp.friendID + " )");
            temp = temp.next;
        }
    }

    // Count Friends of Each User
    public void countFriends() {
    	SocialMediaNode temp = head;

        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friendHead;

            while (f != null) {
                count++;
                f = f.next;
            }

            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    // Find Mutual Friends
    public void findMutualFriends(int userID1, int userID2) {
    	SocialMediaNode user1 = searchByUserID(userID1);
    	SocialMediaNode user2 = searchByUserID(userID2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Mutual Friend ID:");

        FriendNode f1 = user1.friendHead;
        boolean found = false;

        while (f1 != null) {
            FriendNode f2 = user2.friendHead;
            while (f2 != null) {
                if (f1.friendID == f2.friendID) {
                    System.out.println("(" + f1.friendID + ")");
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found)
            System.out.println("No mutual friends");
    }

    // Display User
    private void displayUser(SocialMediaNode user) {
        System.out.println("User ID: " + user.userID + ", Name: " + user.name + ", Age: " + user.age);
    }
}

