package com.lumen.def;

public class DefMain {
	public static void main(String[] args) {
		BonusCalculator bonusCalculator = new EmployeeDetails();
		bonusCalculator.calculate(2300);
		bonusCalculator.greet();
		bonusCalculator.policyType();
		
		AllowanceCalculator allowanceCalculator = new EmployeeDetails();
		allowanceCalculator.calculate(4300);
		allowanceCalculator.policyType();
		
		BonusCalculator.call();
	}
}
