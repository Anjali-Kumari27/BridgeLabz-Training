package com.reflection.retrieveannotation;

import java.lang.annotation.Annotation;

public class UseRetrieveAnnotation {
    public static void main(String[] args) {
        try {
            // Get Class object
            Class<?> cls = Book.class;

            // Check if Author annotation is present
            if (cls.isAnnotationPresent(Author.class)) {
                // Retrieve annotation
                Author author = cls.getAnnotation(Author.class);
                System.out.println("Author Name: " + author.name());
            } else {
                System.out.println("No Author annotation present.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

