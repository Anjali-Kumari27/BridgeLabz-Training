package com.streamapi.foreachmethod.stockpricelogger;

import java.util.*;

/*
 Stock Price Logger
 ○ Scenario: Display all stock prices from a live feed.
 ○ Task: Use forEach() to print updates.
 */
public class UseStockPrice {

	public static void main(String[] args) {

		List<Stock> stockFeed = Arrays.asList(
				new Stock("AAPL", 150.25),
				new Stock("GOOGL", 2800.10),
				new Stock("AMZN", 3400.50),
				new Stock("TSLA", 700.00),
				new Stock("MSFT", 290.45)
		);

		// Stream processing
		System.out.println("\n------------------------------------------------------");
		System.out.println("                  Live Stock Price Updates              ");
		System.out.println("------------------------------------------------------\n");
		
		// forEach() to print updates
		stockFeed.stream()
				/* * forEach is a terminal operation used for 
				 * iterating through every element present in the stream.
				 */
				.forEach(stock -> System.out.println(stock));
	}
}