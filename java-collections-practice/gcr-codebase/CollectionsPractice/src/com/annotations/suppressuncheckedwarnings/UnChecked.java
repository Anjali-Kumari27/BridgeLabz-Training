package com.annotations.suppressuncheckedwarnings;

import java.util.ArrayList;
import java.util.List;

public class UnChecked {
	
	// This annotation hides unchecked compiler warnings
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		// Creating ArrayList WITHOUT generics (raw type)
		ArrayList rawList = new ArrayList();
		
		// Adding elements to raw ArrayList
		rawList.add("Java");
		rawList.add("Annotations");

		// Assigning raw ArrayList to a generic List
        // This normally gives an unchecked warning
		List<String> list = rawList;

		System.out.println(list);
	}

}
