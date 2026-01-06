package com.eventease;

public abstract class Event implements ISchedulable {

    protected String eventName;
    protected String date;

    private final int eventId;      // cannot be changed
    private boolean cancelled = false;

    protected double venueCost;
    protected double cateringCost;
    protected double decorationCost;
    protected double discount;

    // Constructor WITHOUT catering/decoration
    public Event(String eventName, String date, int eventId, double venueCost) {
        this.eventName = eventName;
        this.date = date;
        this.eventId = eventId;
        this.venueCost = venueCost;
    }

    // Constructor WITH catering/decoration
    public Event(String eventName, String date, int eventId,
                 double venueCost, double cateringCost,
                 double decorationCost, double discount) {

        this.eventName = eventName;
        this.date = date;
        this.eventId = eventId;
        this.venueCost = venueCost;
        this.cateringCost = cateringCost;
        this.decorationCost = decorationCost;
        this.discount = discount;
    }

    // Getter (read-only)
    public int getEventId() {
        return eventId;
    }

    // Check cancel status
    public boolean isCancelled() {
        return cancelled;
    }

    protected double calculateTotalCost() {
        return venueCost + cateringCost + decorationCost - discount;
    }

    public void showBill() {
        if (!cancelled) {
            System.out.println("Total Cost = INR " + calculateTotalCost());
        }
    }

    @Override
    public void reschedule(String newDate) {
        if (cancelled) {
            System.out.println("Event is cancelled. Cannot reschedule.");
        } else {
            this.date = newDate;
            System.out.println("Event rescheduled to: " + newDate);
        }
    }

    @Override
    public void cancel() {
        cancelled = true;
        System.out.println("Event cancelled successfully.");
    }

    // Each event must define its own schedule logic
    @Override
    public abstract void schedule();
}
