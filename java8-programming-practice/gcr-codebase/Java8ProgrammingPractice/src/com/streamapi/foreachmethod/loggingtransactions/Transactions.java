package com.streamapi.foreachmethod.loggingtransactions;

/*
 * Represents a transaction with a unique ID.
 */
public class Transactions {

    private String transactionId;

    public Transactions(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    @Override
    public String toString() {
        return transactionId;
    }
}