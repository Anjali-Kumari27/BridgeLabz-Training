package com.lambdaexpression.basicsystemtask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintNumbers {
	public static void main(String[] args) {
		List<Integer> Number = Arrays.asList(10,5,6,8,21,3);
		
		Number.forEach(n -> System.out.println(n));
		
		
	}

}
