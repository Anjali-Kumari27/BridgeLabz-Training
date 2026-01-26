package com.annotations.importantmethod;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Annotation runtime tak available rahegi
@Retention(RetentionPolicy.RUNTIME)

// Annotation sirf METHOD par lag sakti hai
@Target(ElementType.METHOD)
public @interface ImportantMethod {

    // Optional parameter with default value
    String level() default "HIGH";
}
