package com.lumen.quest1;

public class MainCalculator {

	public static void main(String[] args) {
		Calculator calculator = (x, y) -> System.out.println("Sum :" +(x + y));
		calculator.calculate(10, 20);
		calculator = (x, y) -> System.out.println("Difference :" + (x - y));
		calculator.calculate(30, 20);
		calculator = (x, y) -> System.out.println("Product :" + (x * y));
		calculator.calculate(10, 20);
		calculator = (x, y) -> System.out.println("Divide :" + (x / y));
		calculator.calculate(40, 20);

	}

}
