package com.junit.tests;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.com.ListManager;

import static org.junit.jupiter.api.Assertions.*;
public class ListManagerTest {
	ListManager manager;
	List<Integer> list;
	
	@BeforeEach
	void setup() {
		manager = new ListManager();
		list = new ArrayList<>();
	}
	
	@Test
	void testAddElement() {
		manager.addElement(list, 10);
		manager.addElement(list, 20);
		
		assertEquals(2, manager.getSize(list));
		assertTrue(list.contains(10));
		assertTrue(list.contains(20));
	}

	@Test
	void testRemoveElement() {
		list.add(10);
		list.add(20);
		list.add(30);
		manager.removeElement(list, 20);
		
		assertEquals(2, manager.getSize(list));
		assertFalse(list.contains(20));
	}
	
	@Test
	void testGetSize() {
		assertEquals(0, manager.getSize(list));

        manager.addElement(list, 5);
        manager.addElement(list, 15);

        assertEquals(2, manager.getSize(list));
	}
	
	@Test
    void testRemoveElementNotFound() {
        Exception ex = assertThrows(
            IllegalArgumentException.class,
            () -> manager.removeElement(list, 50)
        );
        assertEquals("Element not found in list", ex.getMessage());
    }

    @Test
    void testNullList() {
        assertThrows(
            IllegalArgumentException.class,
            () -> manager.addElement(null, 10)
        );
    }
}
