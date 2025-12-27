package com.constructor.levelone;

public class Circle {
	
	//made attribute private to achieve encapsulation
	private double radius ;
	
	//default constructor (uses constructor chaining)
	Circle(){
		
		//calling parameterized constructor 
		this(5.4);
	}
	
	
	//parameterized constructor
	Circle(double radius){
		
		this.radius = radius;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//created c1 object using default constructor
		Circle c1 = new Circle();
		System.out.println("Circle radius by default constructor : " + c1.radius);
		
		//through c2 object using parameterized constructor
		Circle c2 = new Circle(8.99);
		System.out.println("Circle radius by user defined : " + c2.radius);
		

	}

}
