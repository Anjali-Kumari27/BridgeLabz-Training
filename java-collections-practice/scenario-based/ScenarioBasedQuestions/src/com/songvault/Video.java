package com.songvault;

public class Video extends Media<String> {
    String title;
    String director;
    String duration;
    String genre;

    public Video(String title, String director, String duration, String genre) {
        super("Video");
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return title + " by " + director + " [" + duration + ", " + genre + "]";
    }
}

