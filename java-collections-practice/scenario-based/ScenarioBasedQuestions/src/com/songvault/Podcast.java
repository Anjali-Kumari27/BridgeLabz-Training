package com.songvault;

public class Podcast extends Media<String> {
    String title;
    String host;
    String duration;
    String topic;

    public Podcast(String title, String host, String duration, String topic) {
        super("Podcast");
        this.title = title;
        this.host = host;
        this.duration = duration;
        this.topic = topic;
    }

    @Override
    public String toString() {
        return title + " by " + host + " [" + duration + ", " + topic + "]";
    }
}

