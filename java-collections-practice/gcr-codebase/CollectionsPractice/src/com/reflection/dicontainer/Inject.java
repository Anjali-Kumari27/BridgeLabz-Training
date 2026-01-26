package com.reflection.dicontainer;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// This annotation marks fields that need dependency injection
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
}

