package com.annotations.cacheresult;

public interface MathService {
	@CacheResult
	long fibonacci(int n);
}

//Implementation
class MathServiceImpl implements MathService {

	@Override
	public long fibonacci(int n) {
		if (n <= 1)
			return n;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		} // Simulate expensive computation
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
