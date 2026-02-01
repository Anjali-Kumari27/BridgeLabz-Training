package com.interfaces.marker.cloningprototypeobjects;

/*
 * Cloning Prototype Objects
   ○ Scenario: Clone a predefined object model.
   ○ Task: Use Cloneable marker interface.
 */
public class UseCloningPrototype {

    public static void main(String[] args) {

        Product originalProduct =
                new Product("P101", "Mouse", 1200);

        EmployeeProfile originalEmployee =
                new EmployeeProfile("E201", "Anjali", 3);

        Product clonedProduct =
                (Product) originalProduct.getClone();

        EmployeeProfile clonedEmployee =
                (EmployeeProfile) originalEmployee.getClone();

        System.out.println("Original Product  : " + originalProduct);
        System.out.println("Cloned Product    : " + clonedProduct);

        System.out.println("Original Employee : " + originalEmployee);
        System.out.println("Cloned Employee   : " + clonedEmployee);
    }
}
