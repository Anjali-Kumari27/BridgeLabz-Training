package com.reflection.proxylogging;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// Custom InvocationHandler to log method calls
public class LoggingHandler implements InvocationHandler {

    private final Object target; // original object

    public LoggingHandler(Object target) {
        this.target = target;
    }

    // This method is called whenever any method of the proxy is invoked
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Log the method name before executing
        System.out.println("Method called: " + method.getName());

        // Call the actual method on the original object
        return method.invoke(target, args);
    }
}

