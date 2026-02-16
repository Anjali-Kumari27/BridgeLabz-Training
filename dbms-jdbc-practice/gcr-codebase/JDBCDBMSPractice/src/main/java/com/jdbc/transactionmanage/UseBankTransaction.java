package com.jdbc.transactionmanage;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class UseBankTransaction {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BankDao dao = new BankDao();

        while (true) {
            System.out.println("\n===========================================");
            System.out.println("               Banking System              ");
            System.out.println("===========================================");
            System.out.println("1. Transfer Money");
            System.out.println("2. Check Balance");
            System.out.println("3. Transaction History");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input! Enter number only.");
                continue;
            }

            switch (choice) {

                case 1: {
                    System.out.print("From Account ID: ");
                    int from = Integer.parseInt(input.nextLine());

                    System.out.print("To Account ID: ");
                    int to = Integer.parseInt(input.nextLine());

                    System.out.print("Amount: ");
                    BigDecimal amt = new BigDecimal(input.nextLine());

                    boolean ok = dao.transferMoney(from, to, amt);
                    System.out.println(ok ? "Transfer Successful!" : "Transfer Failed!");
                    break;
                }

                case 2: {
                    System.out.print("Enter Account ID: ");
                    int accId = Integer.parseInt(input.nextLine());

                    BigDecimal bal = dao.getBalance(accId);
                    if (bal == null) System.out.println("Account not found.");
                    else System.out.println("Balance: " + bal);
                    break;
                }

                case 3: {
                    System.out.print("Enter Account ID: ");
                    int accId = Integer.parseInt(input.nextLine());

                    List<String> history = dao.getTransactionHistory(accId);
                    if (history.isEmpty()) {
                        System.out.println("No transactions found.");
                    } else {
                        System.out.println("\n----------------------------------------------------------------------------------------");
                        System.out.println("                               Transaction History                                        ");
                        System.out.println("----------------------------------------------------------------------------------------\n");
                        history.forEach(System.out::println);
                    }
                    break;
                }

                case 0: {
                    System.out.println("==============================");
                    System.out.println("    Exiting the system....    ");
                    System.out.println("==============================");
                    input.close();
                    return;
                }

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
