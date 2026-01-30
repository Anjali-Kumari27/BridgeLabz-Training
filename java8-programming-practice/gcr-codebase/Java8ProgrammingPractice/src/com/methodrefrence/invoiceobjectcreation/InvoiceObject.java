package com.methodrefrence.invoiceobjectcreation;
/*
 * Invoice Object Creation
○ Scenario: Generate invoice objects from transaction IDs.
○ Task: Use a constructor reference.
 */
class InvoiceObject {
    private String transactionId;

    public InvoiceObject(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice{" + "transactionId='" + transactionId + '\'' + '}';
    }
}

