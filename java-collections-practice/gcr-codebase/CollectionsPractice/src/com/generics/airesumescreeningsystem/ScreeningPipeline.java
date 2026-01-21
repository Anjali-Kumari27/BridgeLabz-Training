package com.generics.airesumescreeningsystem;

import java.util.List;

public class ScreeningPipeline {

	public static void screenAll(List<? extends JobRole> roles) {
		System.out.println("\n---------------------------------------------------");
		System.out.println("                Screening Pipeline                   ");
		System.out.println("---------------------------------------------------\n");
		for (JobRole role : roles) {
			System.out.println("Screening role: " + role.getRoleName());
			role.evaluateSkills();
		}
	}
}
