package com.generics.airesumescreeningsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseResumeScreening {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<JobRole> pipelineRoles = new ArrayList<>();

        System.out.println("\n================================================");
        System.out.println("        AI Driven Resume Screening System         ");
        System.out.println("================================================\n");
        System.out.print("Enter candidate name: ");
        String name = input.nextLine();

        System.out.println("\nChoose Job Role:");
        System.out.println("1. Software Engineer");
        System.out.println("2. Data Scientist");
        System.out.println("3. Product Manager");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();

        JobRole selectedRole = null;

        switch (choice) {
            case 1:
                selectedRole = new SoftwareEngineer();
                break;
            case 2:
                selectedRole = new DataScientist();
                break;
            case 3:
                selectedRole = new ProductManager();
                break;
            default:
                System.out.println("Invalid choice!");
                input.close();
                return;
        }

        // Create resume using generics
        Resume<JobRole> resume = new Resume<>(name, selectedRole);

        // Process resume using generic method
        ResumeUtility.process(resume);

        // Add roles to screening pipeline
        pipelineRoles.add(new SoftwareEngineer());
        pipelineRoles.add(new DataScientist());
        pipelineRoles.add(new ProductManager());

        // Screen all roles using wildcard method
        ScreeningPipeline.screenAll(pipelineRoles);

        input.close();
    }
}

