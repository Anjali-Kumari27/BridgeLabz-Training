package com.lambdaexpression.bankingfinance;

@FunctionalInterface
interface CalSimpleInterest{
	double si(double P, double R, double T);
}
public class SimpleInterest {
	public static void main(String[] args) {
		CalSimpleInterest SI = (p,r,t)-> ( p * r * t)/100;
			
		System.out.println("Simple Interest is : " + SI.si(12000, 2.5, 2.5));
	}

}
