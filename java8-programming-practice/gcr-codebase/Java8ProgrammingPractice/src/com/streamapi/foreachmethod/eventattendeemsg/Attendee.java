package com.streamapi.foreachmethod.eventattendeemsg;

/*
 * Represents an event attendee 
 * with a name. 
 */
public class Attendee {

    private String name;

    public Attendee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
