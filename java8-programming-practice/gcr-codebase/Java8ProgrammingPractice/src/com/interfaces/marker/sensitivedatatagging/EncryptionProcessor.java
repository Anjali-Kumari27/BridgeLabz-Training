package com.interfaces.marker.sensitivedatatagging;

public class EncryptionProcessor {

	public static void process(Object obj) {

		if (obj instanceof SensitiveData) {
			System.out.println("Sensitive data found");
			System.out.println("Encrypting data...");
		} else {
			System.out.println("Normal data – no encryption required");
		}
	}
}
