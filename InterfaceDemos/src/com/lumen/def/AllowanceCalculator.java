package com.lumen.def;

public interface AllowanceCalculator {
	void calculate(int amount);
	
	default void policyType() {
		System.out.println("Allowance policy");
	}
}
