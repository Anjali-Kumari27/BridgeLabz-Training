package com.constructor.levelone;

public class Person {
	
	//made attributes private to achieve encapsulation
	private String name;
	private int age;
	private String occupation;
	private double salary;
	
	//Parameterized constructor
	Person(String name, int age, String occupation, double salary){
		this.name = name;
		this.age = age;
		this.occupation = occupation;
		this.salary = salary;
	}
	
	//copy constructor to clone another person's attributes
	Person (Person personDetail){
		this.name = personDetail.name;
		this.age = personDetail.age;
		this.occupation = personDetail.occupation;
		this.salary = personDetail.salary;
	}
	

	//displaying details
	void displayPersonDetails() {
		System.out.println("Person's name : " + name);
		System.out.println("Age of a person : " + age);
		System.out.println("Occupation : " + occupation);
		System.out.println("Salary : " + salary);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//created person1 object for parameterized constructor
		Person person1 = new Person("Aaru" , 38 , "Teacher" , 12500.60);
		
		//displaying details of person1
		System.out.println("Person 1 details : ");
		person1.displayPersonDetails();
		
		
		//person2 object for copy constructor 
		Person person2 = new Person(person1);
		System.out.println("\nPerson 2 details (copy of Person 1) : ");
		
		//through person2 object calling display method
		person2.displayPersonDetails();

	}

}
