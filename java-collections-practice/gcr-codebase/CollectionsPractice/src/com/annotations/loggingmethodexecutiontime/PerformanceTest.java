package com.annotations.loggingmethodexecutiontime;

public class PerformanceTest {

    // Fast method
    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 1000; i++) {
            // simple loop
        }
    }

    // Slow method
    @LogExecutionTime
    public void slowMethod() {
        for (int i = 0; i < 1_000_000; i++) {
            // bigger loop
        }
    }
}

