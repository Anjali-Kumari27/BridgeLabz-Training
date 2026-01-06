package com.petpal;

//subclass Bird inheriting properties from parent class Pet
public class Bird extends Pet{
	
	//constructor
	public Bird(String name, String type, int age , int birdHunger, int birdMood, int birdEnergy) {
		super(name, type, age, birdHunger, birdMood, birdEnergy);
		
		this.name = name;
		this.type = type;
		this.age =  age;
	}

	//overriding abstract method
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Birds are Chirping");
	}

}
