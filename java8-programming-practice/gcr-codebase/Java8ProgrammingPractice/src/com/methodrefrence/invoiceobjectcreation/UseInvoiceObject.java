package com.methodrefrence.invoiceobjectcreation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseInvoiceObject {

    public static void main(String[] args) {

        List<String> transactionIds = List.of("TXN101", "TXN102", "TXN103");

        // Using constructor reference to create Invoice objects
        List<InvoiceObject> invoices = transactionIds.stream()
                .map(InvoiceObject::new)  // constructor reference
                .collect(Collectors.toList());

        // Print invoices
        invoices.forEach(System.out::println);
    }
}
