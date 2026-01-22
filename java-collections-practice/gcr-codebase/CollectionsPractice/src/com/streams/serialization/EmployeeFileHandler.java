package com.streams.serialization;

import java.io.*;
import java.util.List;

public class EmployeeFileHandler {

    // Method to save employee list into file (Serialization)
    public static void saveEmployees(List<Employee> list, String fileName) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(list);
            System.out.println("\nEmployee data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization.");
        }
    }

    // Method to read employee list from file (Deserialization)
    public static List<Employee> readEmployees(String fileName) {

        List<Employee> list = null;

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            list = (List<Employee>) ois.readObject();

        } catch (IOException e) {
            System.out.println("Error during deserialization.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }

        return list;
    }
}

