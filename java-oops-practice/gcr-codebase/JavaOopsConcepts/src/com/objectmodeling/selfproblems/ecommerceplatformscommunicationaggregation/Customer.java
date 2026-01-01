package com.objectmodeling.selfproblems.ecommerceplatformscommunicationaggregation;

public class Customer {

    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    // Communication between Customer and Order
    public void placeOrder(Order order) {
        System.out.println("\nCustomer " + customerName +
                " has placed Order ID: " + order);
        
    }

    public String getCustomerName() {
        return customerName;
    }
}
