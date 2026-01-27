package com.junit.testbeforeaftereach;

public class DatabaseConnection {
	//to check connection status
	private boolean connected = false;
	
	//method to connect db
	public void connect() {
		connected = true;
		System.out.println("Database connected");
	}
	
	public void disconnect() {
		//closing the connection
		connected = false;
		System.out.println("Database disconnected");
	}
	
	//method to check if connected
	public boolean isConnected() {
		return connected;
	}

}
