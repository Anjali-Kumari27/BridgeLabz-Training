package com.petpal;

/*PetPal – Virtual Pet Care App"
Story: You’re creating PetPal, an app that allows users to adopt and care for virtual pets like
dogs, cats, and birds.
Requirements:
● Pet base class: name, type, age.
● Derived classes: Dog, Cat, Bird (use inheritance).
● IInteractable interface with methods like feed(), play(), sleep().
● Encapsulation of hunger and mood levels.
● Use constructors to assign random default values or user-specified pets.
● Operators to increase/decrease energy, hunger based on interactions.
● Polymorphism: makeSound() behaves differently for each pet.
● Access modifiers ensure internal mood status is only modifiable through methods.
*/

import java.util.Scanner;

public class UsePetPal {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//taking inputs for dog
	System.out.println("\n------------ Enter Dog Details ------------");
	System.out.println("Enter hunger level between (1-10): ");
    int dogHunger = input.nextInt();
    System.out.println("Enter mood level between (1-10): ");
    int dogMood   = input.nextInt();
    System.out.println("Enter energy level between (1-10): ");
    int dogEnergy = input.nextInt();
    
    //Parent refrence child object (upcasting)
    //polymorphism (runtime)
    //same method behaves differently for different child objects 
    Pet d = new Dog("coco", "labrador", 3, dogHunger, dogMood, dogEnergy);
    
    
    //taking inputs for cat
    System.out.println("\n------------ Enter Cat Details -----------");
    System.out.println("Enter hunger level between (1-10): ");
    int catHunger = input.nextInt();
    System.out.println("Enter mood level between (1-10): ");
    int catMood   = input.nextInt();
    System.out.println("Enter energy level between (1-10): ");
    int catEnergy = input.nextInt();
    
	Pet c = new Cat("dyna" , "catcat" , 2, catHunger, catMood, catEnergy);
	
	
	
	//taking inputs for bird
    System.out.println("\n----------- Enter Bird Details ------------");
    System.out.println("Enter hunger level between (1-10): ");
    int birdHunger = input.nextInt();
    System.out.println("Enter mood level between (1-10): ");
    int birdMood   = input.nextInt();
    System.out.println("Enter energy level between (1-10): ");
    int birdEnergy = input.nextInt();
    
	Pet b = new Bird("peeps", "parrot", 4, birdHunger, birdMood, birdEnergy);
	
	
	System.out.println("\n**************************");
    System.out.println("     Dog Details ");
    System.out.println("**************************");
    d.displayDetails();
    d.feed();
    d.play();
    d.sleep();
    
    System.out.println("\n\n**************************");
    System.out.println("     Cat Details ");
    System.out.println("**************************");
    c.displayDetails();
    c.feed();
    c.play();
    c.sleep();
    
    System.out.println("\n\n**************************");
    System.out.println("     Bird Details ");
    System.out.println("**************************");
    b.displayDetails();
    b.feed();
    b.play();
    b.sleep();
    
	
	input.close();
	
	}

}
