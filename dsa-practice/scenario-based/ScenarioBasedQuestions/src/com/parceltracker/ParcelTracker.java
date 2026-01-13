package com.parceltracker;

public class ParcelTracker {

    private ParcelNode head;   // First stage

    // Initialize default stages
    public ParcelTracker() {
        head = new ParcelNode("Packed");
        head.next = new ParcelNode("Shipped");
        head.next.next = new ParcelNode("In Transit");
        head.next.next.next = new ParcelNode("Delivered");
    }

    // Forward tracking
    public void trackParcel() {

        ParcelNode temp = head;

        System.out.println("\nParcel Tracking:");
        while (temp != null) {
            System.out.println("-" + temp.stage);
            temp = temp.next;
        }
    }

    // Add custom checkpoint after a given stage
    public void addCheckpoint(String afterStage, String newStage) {

        ParcelNode temp = head;

        while (temp != null) {
            if (temp.stage.equalsIgnoreCase(afterStage)) {

                ParcelNode newNode = new ParcelNode(newStage);
                newNode.next = temp.next;
                temp.next = newNode;

                System.out.println("Checkpoint added: " + newStage);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Stage not found.");
    }

    // Simulate lost parcel (break chain)
    public void markLost(String stageName) {

        ParcelNode temp = head;

        while (temp != null) {
            if (temp.stage.equalsIgnoreCase(stageName)) {
                temp.next = null;   // null pointer
                System.out.println("Parcel lost after stage: " + stageName);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Stage not found.");
    }
}

