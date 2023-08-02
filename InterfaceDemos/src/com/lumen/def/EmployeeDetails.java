package com.lumen.def;

public class EmployeeDetails implements  AllowanceCalculator, BonusCalculator {

	@Override
	public void calculate(int amount) {
		System.out.println("Amount  :" + amount);
	}

	@Override
	public void policyType() {
		// TODO Auto-generated method stub
		AllowanceCalculator.super.policyType();
		BonusCalculator.super.policyType();
		System.out.println("Employee Bonus");
	}
	
	
	
	

}
