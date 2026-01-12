package com.ambulanceroute;

public class AmbulanceRoute {

    private HospitalUnit head = null;

    // Add hospital unit
    public void addUnit(String name, boolean available) {
        HospitalUnit newUnit = new HospitalUnit(name, available);

        if (head == null) {
            head = newUnit;
            newUnit.next = head;
        } else {
            HospitalUnit temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newUnit;
            newUnit.next = head;
        }
        System.out.println("Unit added: " + name);
    }

    // Display all units with status
    public void displayUnits() {
        if (head == null) {
            System.out.println("No hospital units.");
            return;
        }

        HospitalUnit temp = head;
        System.out.println("\nHospital Units Status:");
        do {
            System.out.println("- " + temp.unitName +
                    " | Available: " + temp.available);
            temp = temp.next;
        } while (temp != head);
    }

    // Redirect patient to nearest available unit
    public void redirectPatient() {
        if (head == null) {
            System.out.println("No hospital units.");
            return;
        }

        HospitalUnit temp = head;

        do {
            System.out.println("Checking: " + temp.unitName);

            if (temp.available) {
                System.out.println("Patient redirected to: " + temp.unitName);
                return;
            }
            temp = temp.next;

        } while (temp != head);

        System.out.println("All units are under maintenance.");
    }

    // Put unit under maintenance
    public void putUnderMaintenance(String unitName) {
        changeUnitStatus(unitName, false, "put under maintenance");
    }

    // Make unit available again
    public void makeUnitAvailable(String unitName) {
        changeUnitStatus(unitName, true, "now available");
    }

    // Common method to change status
    private void changeUnitStatus(String unitName, boolean status, String msg) {
        if (head == null) {
            System.out.println("No units present.");
            return;
        }

        HospitalUnit temp = head;

        do {
            if (temp.unitName.equalsIgnoreCase(unitName)) {
                temp.available = status;
                System.out.println(temp.unitName + " is " + msg + ".");
                return;
            }
            temp = temp.next;

        } while (temp != head);

        System.out.println("Unit not found.");
    }
}
