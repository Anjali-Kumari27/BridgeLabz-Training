package com.annotations.bugreportannotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// This annotation can be repeated
@Retention(RetentionPolicy.RUNTIME)     // Needed for reflection
@Target(ElementType.METHOD)             // Used on methods
@Repeatable(BugReports.class)           // Linking to container
public @interface BugReport {

    // Description of the bug
    String description();
}

