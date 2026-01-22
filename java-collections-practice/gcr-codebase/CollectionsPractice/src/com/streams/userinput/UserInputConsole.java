package com.streams.userinput;

import java.io.*;

public class UserInputConsole {

    public static void main(String[] args) {

        // File name where data will be stored
        String fileName = "C:\\Users\\91743\\OneDrive\\Desktop\\userDetails.txt";

        // Try-with-resources for automatic closing
        try (
            // Read input from console
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Write data to file
            FileWriter fw = new FileWriter(fileName)
        ) {

            // Ask user for details
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            // Write data into file
            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Favorite Language: " + language + "\n");

            System.out.println("User details saved successfully!");

        } catch (IOException e) {
            System.out.println("Error while reading input or writing to file.");
        }
    }
}
