package com.generics.smartwarehousesystem;

public abstract class WarehouseItem {
	private String name;

	public WarehouseItem(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// Every item must define how it displays itself
	public abstract void displayInfo();
}
