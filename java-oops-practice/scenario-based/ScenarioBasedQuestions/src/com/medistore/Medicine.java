package com.medistore;

import java.time.LocalDate;
import java.time.YearMonth;

public abstract class Medicine implements ISellable {
	
	protected String name;

    // format: yyyy-MM
	protected String expiryDate; 

	private double price; // price is sensitive data 
	private int quantity; // stock hidden

	// Constructor with default stock
	public Medicine(String name, double price, String expiryDate) {
		this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;
		this.quantity = 10;
	}

	// REAL expiry check using system date
	protected boolean isExpiredByDate() {
		YearMonth expiry = YearMonth.parse(expiryDate);
		YearMonth current = YearMonth.from(LocalDate.now());
		return expiry.isBefore(current);
	}

	protected void reduceStock(int qty) {
		quantity -= qty;
	}

	@Override
	public void sell(int qty) {

		if (qty > quantity) {
			System.out.println("Insufficient stock!");
			return;
		}

		if (checkExpiry()) {
			System.out.println("Medicine is expired. Cannot sell.");
			return;
		}

		double total = price * qty;
		double discount = total > 500 ? total * 0.10 : 0;
		double payable = total - discount;

		reduceStock(qty);

		System.out.println("\n========== Billing ============\n");
		System.out.println("Total Price : INR " + total);
		System.out.println("Discount    : INR " + discount);
		System.out.println("Payable     : INR " + payable);
		System.out.println("Stock Left  : " + quantity);
	}

	public abstract void displayDetail();
}
