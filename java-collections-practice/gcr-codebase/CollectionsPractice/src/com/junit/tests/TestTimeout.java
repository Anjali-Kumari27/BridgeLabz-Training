package com.junit.performancetesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTimeout {
	TaskPerformance task = new TaskPerformance();
	
	@Test
	@Timeout(value=2, unit = TimeUnit.SECONDS)
	void testLongRunningTaskPerformance() {
		String result = task.longRunningTask();
		assertEquals("Task Completed", result);
	}
	
	@Test
	void testLongRunningTaskWithAssertTimeout() {
	    assertTimeout(Duration.ofSeconds(2), () -> {
	        task.longRunningTask(); // will fail if > 2 seconds
	    });
	}

}
