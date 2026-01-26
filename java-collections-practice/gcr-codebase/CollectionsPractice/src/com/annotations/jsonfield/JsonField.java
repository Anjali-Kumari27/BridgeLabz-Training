package com.annotations.jsonfield;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Annotation will be available at runtime
@Retention(RetentionPolicy.RUNTIME)

// Can be applied on fields only
@Target(ElementType.FIELD)
public @interface JsonField {

    // Custom JSON key name
    String name();
}
