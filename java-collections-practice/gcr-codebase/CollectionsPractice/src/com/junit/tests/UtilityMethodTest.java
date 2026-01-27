package com.junit.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.com.StringUtils;

public class UtilityMethodTest {

    StringUtils utils;

    @BeforeEach
    void setup() {
        utils = new StringUtils();
    }

    @Test
    void testReverse() {
        assertEquals("ilajna", utils.reverse("anjali"));
    }

    @Test
    void testIsPalindromeFalse() {
        assertFalse(utils.isPalindrome("java"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("JAVA", utils.toUpperCase("java"));
    }

    @Test
    void testNullString() {
        assertNull(utils.reverse(null));
        assertFalse(utils.isPalindrome(null));
        assertNull(utils.toUpperCase(null));
    }
}
