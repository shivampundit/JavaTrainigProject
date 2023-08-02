package com.lumen.fun;

public class Adder implements NewCalculator {

	@Override
	public void calculate(int x, int y) {
		System.out.println("Sum : " + (x+y) );
	}
	
}
