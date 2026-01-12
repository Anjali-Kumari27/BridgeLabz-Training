package com.traincompanion;

public class Train {

    private Compartment head;
    private Compartment current;

    // Add compartment with service
    public void addCompartment(String name, String service) {

        Compartment newComp = new Compartment(name, service);

        if (head == null) {
            head = newComp;
            current = head;
        } else {
            Compartment temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newComp;
            newComp.prev = temp;
        }

        System.out.println("Added: " + name + " | Service: " + service);
    }

    // Move forward
    public void moveForward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("=>> Moved to: " + current.name);
        } else {
            System.out.println("No next compartment.");
        }
    }

    // Move backward
    public void moveBackward() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("<<= Moved to: " + current.name);
        } else {
            System.out.println("No previous compartment.");
        }
    }

    // Show current + adjacent
    public void showAdjacent() {

        if (current == null) {
            System.out.println("Train empty.");
            return;
        }

        System.out.println("\nCurrent: " + current.name +
                " | Service: " + current.service);

        System.out.println("<< Previous: " +
                (current.prev != null ? current.prev.name : "None"));

        System.out.println(">> Next: " +
                (current.next != null ? current.next.name : "None"));
    }

    // SEARCH SERVICE
    public void searchService(String serviceName) {

        Compartment temp = head;
        int position = 1;

        while (temp != null) {

            if (temp.service.equalsIgnoreCase(serviceName)) {
                System.out.println("Service '" + serviceName +
                        "' found in compartment: " + temp.name +
                        " (Position " + position + ")");
                return;
            }

            temp = temp.next;
            position++;
        }

        System.out.println("Service not found in train.");
    }
}
