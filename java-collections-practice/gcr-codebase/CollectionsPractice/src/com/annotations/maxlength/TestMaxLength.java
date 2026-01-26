package com.annotations.maxlength;

import java.util.Scanner;

public class TestMaxLength  {
    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String userName = input.nextLine();
        try {
            User user = new User(userName);
            System.out.println("User created successfully");
            System.out.println("Username: " + user.getUsername());
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error : " +e.getMessage());
            
        }
        input.close();
    }
}
