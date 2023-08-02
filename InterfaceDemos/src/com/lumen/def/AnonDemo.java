package com.lumen.def;

public class AnonDemo {
	public static void main(String[] args) {
		BonusCalculator bonusCalculator = new BonusCalculator() {
			
			@Override
			public void calculate(int amount) {
				System.out.println("Amount : " + amount*2);
				
			}
		};
		
		bonusCalculator.calculate(2300);
	}
}
