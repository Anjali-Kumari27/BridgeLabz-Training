package com.songvault;

public class Media<T> {
    T type;  // Audio, Video, Podcast

    public Media(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }
}

