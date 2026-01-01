package com.inheritance.hybridinheritance.restaurantmanagementsystem;

public class UsePerson {
	public static void main(String[] args) {

        Worker w1 = new Chef("Ramesh", 101, "Indian Cuisine");
        Worker w2 = new Waiter("Suresh", 102, 8);

        System.out.println("-----------------Chef-----------------");
        ((Person) w1).displayPersonInfo();
        w1.performDuties();

        System.out.println("\n-----------------Waiter-----------------");
        ((Person) w2).displayPersonInfo();
        w2.performDuties();
    }


}
