package com.annotations.cacheresult;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CacheResult {
    // No parameters needed for basic caching
}

