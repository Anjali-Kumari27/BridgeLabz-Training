package com.interfaces.basic.smartdevicecontrol;
import java.util.Scanner;
public class UseSmartDeviceControl {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();
        
        System.out.println("\n=======================================================");
        System.out.println("                  Smart Home Device Manager              ");
        System.out.println("=======================================================\n");
        System.out.println("1. ON all devices");
        System.out.println("2. OFF all devices");
        System.out.println("3. ON only Light and AC");
        System.out.println("4. ON only Light and TV");
        System.out.println("5. ON only AC and TV");
        
        System.out.print("\nEnter your Choice : ");
        int choice = input.nextInt();
        
        System.out.print("\n--------------------------------------------\n");
        if (choice == 1) {
            light.turnOn();
            ac.turnOn();
            tv.turnOn();
        } 
        else if (choice == 2) {
            light.turnOff();
            ac.turnOff();
            tv.turnOff();
        } 
        else if (choice == 3) {
            light.turnOn();
            ac.turnOn();
            tv.turnOff();
        } 
        else if (choice == 2) {
            light.turnOn();
            ac.turnOff();
            tv.turnOn();
        } 
        else if (choice == 5) {
            light.turnOff();
            ac.turnOn();
            tv.turnOn();
        } 
        else {
            System.out.println("Invalid choice");
        }

       input.close();
	}

}
