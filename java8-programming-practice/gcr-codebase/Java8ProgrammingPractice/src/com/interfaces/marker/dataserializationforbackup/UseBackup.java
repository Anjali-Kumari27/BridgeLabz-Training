package com.interfaces.marker.dataserializationforbackup;


public class UseBackup {

    public static void main(String[] args) {

        UserData user = new UserData("Anjali", "anjali@email.com");
        TempData temp = new TempData("session cache");

        BackupService.backupCheck(user);
        BackupService.backupCheck(temp);
    }
}

