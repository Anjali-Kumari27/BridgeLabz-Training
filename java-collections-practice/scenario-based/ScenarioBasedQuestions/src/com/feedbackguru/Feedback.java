package com.feedbackguru;

public class Feedback<T> {

    T type;          // Product / Service
    String message;  // feedback text
    int rating;      // out of 10

    public Feedback(T type, String message, int rating) {
        this.type = type;
        this.message = message;
        this.rating = rating;
    }
}
