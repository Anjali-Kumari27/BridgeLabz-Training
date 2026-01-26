package com.annotations.jsonfield;

import java.util.Scanner;

public class UseJsonField {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        // Create object using user input
        User user = new User(username, age);

        // Convert object to JSON
        String json = JsonSerializer.toJson(user);

        // Print JSON
        System.out.println("Generated JSON:");
        System.out.println(json);
    }
}
