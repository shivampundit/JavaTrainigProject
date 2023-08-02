package com.lumen.quest2;

public class BasicCalculator implements Calculator {

	@Override
	public void add(int x, int y) {
		System.out.println("Sum : " + (x + y));

	}

	@Override
	public void subtract(int x, int y) {
		System.out.println("Subtract : " + (x - y));
		
	}
	
	@Override
	public void product(int x, int y) {
		System.out.println("Mul : " + (x * y));

	}


	@Override
	public void division(double x, double y) {
		System.out.println("Division : " + (x / y));
	}

}
