package com.functionalinterface.consumer.account;
/*
 * 4.Display account balance using Consumer.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AccountDisplay {
	public static void main(String[] args) {
       
        List<Account> account = new ArrayList<>();
        account.add(new Account("101", "Anjali", 50000.0));
        account.add(new Account("108", "Diksha", 45000.5));
        account.add(new Account("122", "Tisa", 62000.75));

        // Consumer to display account balance
        Consumer<Account> displayBalance = a -> 
            System.out.println("Account Holder : " + a.accHolderName + ", Account Balance: INR " + a.accountBalance);

        // Display account balance for all account holder
        System.out.println("\n==================================================================");
        System.out.println("                   Displaying Employee Account Balances             ");
        System.out.println("==================================================================\n");
        for (Account a : account) {
            displayBalance.accept(a); // perform action using Consumer
        }
    }

}
