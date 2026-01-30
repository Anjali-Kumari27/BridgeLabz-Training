package com.lambdaexpression.smarthomelighting;

/*
 * 1. Smart Home Lighting Automation
○ Scenario: A building has smart lights. Different triggers (motion, time of day, voice
commands) need to execute different light patterns.
○ Task: Use lambdas to define these light activation behaviors dynamically without
creating multiple classes.
 */
public class SmartHomeLightining {

	@FunctionalInterface
	interface LightAction {
		void execute();
	}

	// Method to activate light
	public static void activateLight(LightAction action) {
		action.execute();
	}

	public static void main(String[] args) {

		// Motion Trigger
		LightAction motionTrigger = () -> System.out.println("Motion detected : Lights turned ON at full brightness");

		// Time of Day Trigger
		LightAction timeTrigger = () -> System.out.println("Night time : Lights dimmed to 30% for comfort");

		// Voice Command Trigger
		LightAction voiceTrigger = () -> System.out.println("Voice command : Lights changed to warm yellow");

		// Activating all triggers
		activateLight(motionTrigger);
		activateLight(timeTrigger);
		activateLight(voiceTrigger);
	}
}
