package com.lambdaexpression.basicsystemtask;

@FunctionalInterface
interface Addition{
	int add(int num1, int num2);
}
public class AddNumber {
	public static void main(String[] args) {
		Addition adding;
		adding =(a,b) -> a+b;
		
		System.out.println(adding.add(10, 2));
	}

}
