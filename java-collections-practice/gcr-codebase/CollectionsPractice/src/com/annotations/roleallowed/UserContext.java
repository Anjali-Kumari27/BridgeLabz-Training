package com.annotations.roleallowed;
import java.util.Scanner;
public class UserContext {

    // Simulating current logged-in user role
    public static String currentRole ; // take ADMIN to allow
    
    public static void takeUserRole() {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter your Role (ADMIN / USER) : ");
    	currentRole = input.nextLine().toUpperCase();
    }
}

