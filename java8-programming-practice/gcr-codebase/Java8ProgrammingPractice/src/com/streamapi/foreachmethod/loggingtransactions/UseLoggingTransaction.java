package com.streamapi.foreachmethod.loggingtransactions;

import java.time.LocalDateTime;
import java.util.*;

/*
 5. Logging Transactions
 Given a list of transaction IDs, use forEach() to log each transaction to the console with a
 timestamp.
 transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + " -
 Transaction: " + id));
 */
public class UseLoggingTransaction {

    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList(
                "TXN-1001",
                "TXN-1002",
                "TXN-1003",
                "TXN-1004"
        );

        System.out.println("\n*********************************************");
        System.out.println("         Starting Transaction Log...           ");
        System.out.println("*********************************************\n");

        // Stream processing
        // Using forEach() to log each transaction to the console with a timestamp
        transactionIds.stream()
                /*
                 * forEach is a terminal operation used for iterating through 
                 * every element present in the stream
                 */
                .forEach(id -> System.out.println(LocalDateTime.now() + " - Transaction: " + id));

        /*
         * Terminal operations mark the end of the stream and 
         * return the result or trigger the side effect
         */
    }
}