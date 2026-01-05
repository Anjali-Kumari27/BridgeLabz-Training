package com.objectmodeling.classobjectsequencediagram.grocerybillgenerator;

/* Grocery bill generator 

Class Diagram 

The class diagram models the system where a customer buys products, and the bill is generated.
Diagram Description:
Classes: Customer, Product, BillGenerator
Relationships:
A Customer can purchase multiple Product items (Composition).
BillGenerator computes the total for the Customer.



Object Diagram

An object diagram shows the details of a Customer and the Product objects they have purchased.
Example:
Customer: Alice
Products:
Apples (2 kg at $3 per kg)
Milk (1 liter at $2 per liter)



Sequence Diagram

The sequence diagram shows the process of bill generation for a customer.
Scenario: A customer checks out at the grocery store, and the total bill is generated.
Actors:
Customer
BillGenerator

→ Draw the Sequence Diagram

Feature :                   Grocery Store Bill Application
Classes :                   Customer, Product, BillGenerator
Relationships :             Composition
Primary Functionality :     Generate total bill
Key Entities                Customers, Products, Bills

*/







