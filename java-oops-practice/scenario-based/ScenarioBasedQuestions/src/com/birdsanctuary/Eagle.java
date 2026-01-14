package com.birdsanctuary;

//Eagle can fly
public class Eagle extends Bird implements Flyable {

       public Eagle(int id, String name) {
          super(id, name, "Eagle");
       }

       public void fly() {
          System.out.println(getName() + " is flying high.");
       }
}

