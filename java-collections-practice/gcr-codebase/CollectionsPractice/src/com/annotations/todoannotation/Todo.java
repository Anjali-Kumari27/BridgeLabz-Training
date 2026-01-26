package com.annotations.todoannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Annotation runtime tak available rahegi
@Retention(RetentionPolicy.RUNTIME)

@Target(ElementType.METHOD)
public @interface Todo {

    // Description of the pending task
    String task();

    // Developer responsible for the task
    String assignedTo();

    // Priority of the task (optional)
    String priority() default "MEDIUM";
}

