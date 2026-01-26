package com.annotations.usedeprecated;

public class UseLegacy {
	public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();

        api.oldFeature();   //Deprecated warning
        api.newFeature();   
    }

}
