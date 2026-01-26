package com.annotations.cacheresult;

import java.lang.reflect.*;
import java.util.*;

public class CacheHandler implements InvocationHandler {

    private final Object target;
    private final Map<String, Object> cache = new HashMap<>();

    public CacheHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Check if method has @CacheResult
        if (method.isAnnotationPresent(CacheResult.class)) {
            String key = method.getName() + Arrays.toString(args);

            // Return cached result if available
            if (cache.containsKey(key)) {
                System.out.println("Returning cached result for: " + key);
                return cache.get(key);
            }

            // Compute, cache, and return
            Object result = method.invoke(target, args);
            cache.put(key, result);
            return result;
        }

        // If no annotation, just call the method
        return method.invoke(target, args);
    }

    // Utility method to create proxy
    public static <T> T createProxy(T target, Class<T> interfaceType) {
        return (T) Proxy.newProxyInstance(
            interfaceType.getClassLoader(),
            new Class<?>[]{interfaceType},
            new CacheHandler(target)
        );
    }
}

