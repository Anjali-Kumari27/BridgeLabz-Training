package com.junit.testbeforeaftereach;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
public class TestDatabase {
	DatabaseConnection db;
	
	//runs before each test
	@BeforeEach
	void setup() {
		db = new DatabaseConnection();
		
		//initialize connection before each test
		db.connect();
	}
	
	//This method runs after each test
	@AfterEach
	void tearDown() {
		db.disconnect();
	}
	
	 @Test
	    void testConnectionEstablished() {
	        assertTrue(db.isConnected(), "Connection should be established before test");
	    }

	    // Test to check if connection is closed correctly
	    @Test
	    void testConnectionClosed() {
	        db.disconnect(); // manually disconnect
	        assertFalse(db.isConnected(), "Connection should be closed after disconnect");
	    }

}
