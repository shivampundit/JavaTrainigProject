package com.lumen.fun;

public class ProcessMain {

	public static void main(String[] args) {
		Processor processor = new Processor();
		
		/*
		
		NewCalculator adder = new Adder();

		processor.processData(adder, 10, 23);
		processor.processData(new Adder(), 2, 7);

		processor.processData(new NewCalculator() {

			@Override
			public void calculate(int x, int y) {
				System.out.println("Sum : " + (x + y));
			}
		}, 20, 10);
		
		*/

		processor.processData((x, y) -> System.out.println("Sum : " + (x + y)), 28, 13);
	}

}
