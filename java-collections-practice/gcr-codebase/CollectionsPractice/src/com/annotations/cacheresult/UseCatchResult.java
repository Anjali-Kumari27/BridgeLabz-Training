package com.annotations.cacheresult;

public class UseCatchResult {
	
	public static void main(String[] args) {
        MathService mathService = CacheHandler.createProxy(new MathServiceImpl(), MathService.class);

        System.out.println("Result: " + mathService.fibonacci(10));
        System.out.println("Result: " + mathService.fibonacci(10)); // Should use cache
        System.out.println("Result: " + mathService.fibonacci(9));  // Compute new
    }

}
