package com.lumen.atm;

public class Savings extends Account  {

	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		super.withdraw(amount);
		System.out.println("Withdraw in Saving: "+ amount);
		balance -= amount;
		System.out.println("Total Balance in Saving "+ balance);
		
	}

	@Override
	void deposite(double amount) {
		super.deposite(amount);
		System.out.println("Deposite in Saving: "+ amount);
		balance+=amount;
		System.out.println("Total Balance in Saving "+ balance);
		
	}
	
	

}
