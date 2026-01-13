package com.homenest;

/*
 * HomeNest – Smart Home Device Manager"
Story: A tech company builds HomeNest, a system to control smart lights, ACs, locks, and
cameras.
Requirements:
● Device base class: deviceId, status, energyUsage.
● Subclasses: Light, Camera, Thermostat, Lock.
● Interface IControllable: turnOn(), turnOff(), reset().
● Use constructors to register devices with user.
● Encapsulation: device status cannot be modified externally.
● Operators for energy usage calculations.
● Polymorphism: reset() behavior varies by device.
● Use access modifiers to secure firmware update logs.

 */

import java.util.Scanner;

public class UseHomeNest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Register devices
        Device[] devices = {
                new Light("L-101"),
                new Camera("C-202"),
                new Thermostat("T-303"),
                new Lock("LK-404")
        };

        while (true) {

            System.out.println("\n=========================================================");
            System.out.println("                HomeNest Device Manager                    ");
            System.out.println("=========================================================\n");
            for (int i = 0; i < devices.length; i++) {
                System.out.println((i + 1) + ". " + devices[i].getClass().getSimpleName());
            }
            System.out.println("0. Exit");

            System.out.print("Select device: ");
            int choice = input.nextInt();

            if (choice == 0) {
                System.out.println("\n***********************************");
                System.out.println("     Thankyou for Using HomeNest     ");
                System.out.println("***********************************\n");
                break;
            }

            if (choice < 1 || choice > devices.length) {
                System.out.println("Invalid choice!");
                continue;
            }

            Device device = devices[choice - 1];

            System.out.println("\n1. Turn ON");
            System.out.println("2. Turn OFF");
            System.out.println("3. Reset");
            System.out.println("4. View Status");

            System.out.print("Enter action: ");
            int action = input.nextInt();

            switch (action) {
                case 1 -> device.turnOn();
                case 2 -> device.turnOff();
                case 3 -> device.reset();
                case 4 -> device.displayStatus();
                default -> System.out.println("Invalid action");
            }
        }

        input.close();
    }
}

