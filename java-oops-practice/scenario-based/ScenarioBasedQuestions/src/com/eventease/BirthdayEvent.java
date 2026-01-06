package com.eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String eventName, String date, int eventId,
                         double venueCost, double cateringCost,
                         double decorationCost, double discount) {

        super(eventName, date, eventId,
              venueCost, cateringCost, decorationCost, discount);
    }

    @Override
    public void schedule() {
        if (!isCancelled()) {
            System.out.println("Birthday Event scheduled with cake & decorations");
        }
    }
}

