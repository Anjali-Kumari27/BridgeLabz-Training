package com.annotations.usedeprecated;

public class LegacyAPI {
	@Deprecated
    public void oldFeature() {
        System.out.println("Old feature is running (not recommended)");
    }
	
	public void newFeature() {
        System.out.println("New feature is running");
    }

}
