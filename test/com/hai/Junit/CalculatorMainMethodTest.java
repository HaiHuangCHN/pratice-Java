package com.hai.Junit;

public class CalculatorMainMethodTest{

	public static void main(String[] args) {
	/*	Calculator calculator1 = new Calculator();
		int result1 = calculator1.add(1, 2);
		if (result1 == 3) {
			System.out.println("add() Pass");
		}else {
			System.out.println("add() Fail");
		}
		
		
		Calculator calculator2 = new Calculator();
		int result2 = calculator2.sub(1, 2);
		if (result2 == -1) {
			System.out.println("sub() Pass");
		}else {
			System.out.println("sub() Fail");
		}*/
		double amount = 2.50;
		long amount1 = new Double(amount).longValue();
		System.out.println(amount1);
	}

}
