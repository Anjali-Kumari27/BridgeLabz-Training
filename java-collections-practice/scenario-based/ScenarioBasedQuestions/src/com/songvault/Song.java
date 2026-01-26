package com.songvault;

public class Song extends Media<String> {
    String title;
    String artist;
    String duration;  // e.g., 5:55
    String genre;

    public Song(String title, String artist, String duration, String genre) {
        super("Audio");
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " [" + duration + ", " + genre + "]";
    }
}

