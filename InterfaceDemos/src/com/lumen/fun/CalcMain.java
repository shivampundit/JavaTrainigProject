package com.lumen.fun;

public class CalcMain {

	public static void main(String[] args) {

		NewCalculator calculator = (x, y) -> System.out.println(x+y);
		calculator.calculate(10, 20);

		calculator = (x, y) -> System.out.println(x-y);
		calculator.calculate(30, 20);
		 calculator = (x, y) -> System.out.println(x*y);
		calculator.calculate(10, 20);
		calculator = (x, y) -> System.out.println(x/y);
		calculator.calculate(40, 20);
		
		
		Printer printer = () -> {return "Great Day!";};
		System.out.println(printer.print());
		
		printer = () -> "Welcome back";
		System.out.println(printer.print());

	}

}
