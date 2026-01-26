package com.annotations.bugreportannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// This is the container annotation
@Retention(RetentionPolicy.RUNTIME)   // Available at runtime
@Target(ElementType.METHOD)           // Can be applied on methods
public @interface BugReports {

    // Array of BugReport annotations
    BugReport[] value();
}

