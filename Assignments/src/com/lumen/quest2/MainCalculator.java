package com.lumen.quest2;

public class MainCalculator {
	public static void main(String[] args) {
		Calculator calculator = new BasicCalculator();
		calculator.add(12, 8);
		calculator.subtract(21, 7);
		calculator.product(12, 8);
		calculator.division(20, 4);
		
		Scientific scientific = new ScientificCalculator();
		scientific.add(5, 5);
		scientific.subtract(21, 7);
		scientific.division(20, 4);
		scientific.product(5, 5);
		scientific.square(5);
		scientific.cube(5);
//		scientific.difference(10, 3);
		
		
	}

}
