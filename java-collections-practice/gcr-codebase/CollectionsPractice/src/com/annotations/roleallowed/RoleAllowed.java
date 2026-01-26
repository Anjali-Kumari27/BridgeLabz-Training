package com.annotations.roleallowed;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Annotation runtime tak available rahegi
@Retention(RetentionPolicy.RUNTIME)

// Annotation METHOD par apply hogi
@Target(ElementType.METHOD)
public @interface RoleAllowed {

    // Role allowed to access the method
    String value();
}

