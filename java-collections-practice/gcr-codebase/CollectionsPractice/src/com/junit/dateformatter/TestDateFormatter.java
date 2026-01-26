package com.junit.dateformatter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestDateFormatter {
	DateFormatter date = new DateFormatter();

	@Test
    void testValidDate() {
        String result = date.formatDate("2024-01-15");
        assertEquals("15-01-2024", result);
    }
	@Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            date.formatDate("15-01-2024");
        });
    }
	@Test
    void testInvalidDateValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            date.formatDate("2024-13-40");
        });
    }
}
