package com.reflection.retrieveannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// RetentionPolicy.RUNTIME is mandatory to access annotation at runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String name();
}

