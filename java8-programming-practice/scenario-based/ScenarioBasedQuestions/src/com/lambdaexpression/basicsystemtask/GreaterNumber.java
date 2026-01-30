package com.lambdaexpression.basicsystemtask;
@FunctionalInterface
interface Greater{
	int GreaterNum(int number1, int number2);
}
public class GreaterNumber {
	public static void main(String[] args) {
		
		
		Greater greater = (a,b) -> {
			if(a>b) {
				return a;
			}else {
				return b;
			}
		};
		
		System.out.println("Greater Number is " + greater.GreaterNum(8, 10));
	}

}
