package com.interfaces.marker.dataserializationforbackup;
/*
 * 1. Data Serialization for Backup
   ○ Scenario: Mark certain classes as Serializable for backup storage.
   ○ Task: Implement marker interface for backup processing.
 */
import java.io.Serializable;

//this class is marked for backup using Serializable
public class UserData implements Serializable {

	String name;
	String email;

	// constructor
	public UserData(String name, String email) {
		this.name = name;
		this.email = email;
	}
}
