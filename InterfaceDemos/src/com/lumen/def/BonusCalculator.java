package com.lumen.def;

public interface BonusCalculator {

	void calculate(int amount);
	default void greet() {
		System.out.println("Have a great day! ");
	}
	default void policyType() {
		System.out.println("Bonus Policy");
	}
	static void call() {
		System.out.println("Calling for Lunch");
	}
}
