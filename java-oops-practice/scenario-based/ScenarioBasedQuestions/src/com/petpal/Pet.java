package com.petpal;

public abstract  class Pet implements IInteractable{
	
	//instance variables
	protected String name;
	protected String type;
	protected int age;
	
	private int hunger;
	private int moodLevel;
	private int energy;
	
	//constructor
	public Pet(String name, String type, int age, int hunger , int moodLevel, int energy) {
		this.name = name;
		this.type = type;
		this.age = age;
		this.hunger = hunger;
		this.moodLevel = moodLevel;
		this.energy = energy;
		
	}

	//abstract method
	public abstract void  makeSound();

	//feed method 
	public void feed() {
		if(hunger >= 5) {
			System.out.println(name + " want to have food");
		}
		else {
			System.out.println(name + " is not hungry");
		}
	}
	
	public void play() {
		if(energy >= 5) {
			System.out.println(name + " wants to play");
		}
		else {
			System.out.println(name + " does not want to play");
		}
	}
	
	public void sleep() {
		if(moodLevel >= 5) {
			System.out.println(name + " wants to sleep");
		}
		else {
			System.out.println(name + " does not want to sleep ");
		}
	}
	
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Name : " + name);
		System.out.println("Type : " + type);
		System.out.println("Age : " + age);
		System.out.println("Hunger Level is : " + hunger);
		System.out.println("Mood Level is : " + moodLevel);
		System.out.println("Energy Level is : " + energy);
		System.out.println("\n-----------------------");
		
	}
}
