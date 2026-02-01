package com.interfaces.marker.dataserializationforbackup;

import java.io.Serializable;

public class BackupService {

	// checks whether object can be backed up
	public static void backupCheck(Object obj) {

		if (obj instanceof Serializable) {
			System.out.println("Object can be backed up");
		} else {
			System.out.println("Object cannot be backed up");
		}
	}
}
