package com.streams.countwords;

import java.util.Scanner;

public class UseCountWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String filePath = input.nextLine();

        FrequentWord wc = new FrequentWord();
        wc.countWords(filePath);

        input.close();
    }
}
