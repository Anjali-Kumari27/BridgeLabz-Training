package com.petpal;

public class Dog extends Pet {
	
	//constructor
	public Dog(String name, String type, int age, int dogHunger, int dogMood, int dogEnergy) {
		super(name, type, age, dogHunger, dogMood, dogEnergy);
		
		this.name = name;
		this.type = type;
		this.age =  age;
		
	}
	
	//overriding abstract method
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Dog Barks");
	}
	
}
