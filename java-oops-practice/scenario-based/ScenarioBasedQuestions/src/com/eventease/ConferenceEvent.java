package com.eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String eventName, String date,
                           int eventId, double venueCost) {

        super(eventName, date, eventId, venueCost);
    }

    @Override
    public void schedule() {
        if (!isCancelled()) {
            System.out.println("Conference Event scheduled (No catering/decoration)");
        }
    }
}

