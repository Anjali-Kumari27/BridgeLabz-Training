package com.reflection.proxylogging;

import java.lang.reflect.Proxy;

public class TestLoggingProxy {
    public static void main(String[] args) {
        // Original object
        Greeting greeting = new GreetingImplement();

        // Create a proxy instance
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),       // class loader
                new Class[]{Greeting.class},           // interfaces to implement
                new LoggingHandler(greeting)           // invocation handler
        );

        // Call method on proxy
        proxyInstance.sayHello(); // This will log method name first
    }
}

