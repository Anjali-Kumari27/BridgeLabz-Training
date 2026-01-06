package com.petpal;

public class Cat extends Pet{
	
	//constructor
	public Cat(String name, String type, int age, int catHunger, int catMood,int catEnergy) {
		super(name, type, age, catHunger,catMood, catEnergy);
		
		this.name = name;
		this.type = type;
		this.age =  age;
	}

	//overriding abstract method
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Cat meows");
	}
}
