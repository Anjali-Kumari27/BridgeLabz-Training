package com.functionalinterface.consumer.account;

public class Account {
    String id;
    String accHolderName;
    double accountBalance;

    Account(String id, String accHolderName, double accountBalance) {
        this.id = id;
        this.accHolderName = accHolderName;
        this.accountBalance = accountBalance;
    }
}
