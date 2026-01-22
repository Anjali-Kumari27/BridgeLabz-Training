package com.streams.readlargefile;

import java.util.Scanner;

public class UseReadLarge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String filePath = input.nextLine();

        ErrorFileReader reader = new ErrorFileReader();
        reader.readErrorLines(filePath);

        input.close();
    }
}
