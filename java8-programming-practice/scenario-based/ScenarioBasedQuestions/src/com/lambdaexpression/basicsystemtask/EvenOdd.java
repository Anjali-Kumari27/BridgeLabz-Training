package com.lambdaexpression.basicsystemtask;

@FunctionalInterface
interface EvenOddCheck{
	String evenOdd(int n);
}
public class EvenOdd {
	public static void main(String[] args) {
		EvenOddCheck check = (n) ->{
			if(n%2==0) {
				return "This Number is Even Number";
			}else {
				return "It is an Odd Number";
			}
		};
		
		System.out.println(check.evenOdd(6));
	}

}
