package com.objectmodeling.selfproblems.ecommerceplatformscommunicationaggregation;

public class UseEcommerce {
	public static void main(String[] args) {

        // Create Products
        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Headphones", 2000);
        Product p3 = new Product("Mouse", 800);

        // Create Customer
        Customer customer = new Customer("Anjali");

        // Create Order
        Order order1 = new Order(101);

        // Add products to order (Aggregation)
        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p3);

        // Customer places order (Association + Communication)
        System.out.println("Customer " + customer.getCustomerName() +
                " placed an order.");

        order1.showOrderDetails();
    }

}
