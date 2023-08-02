package com.lumen.atm;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		super.withdraw(amount);
		System.out.println("Withdraw in Current: " + amount);
		balance -= amount;
		System.out.println("Total Balance in Current: " + balance);

	}

	@Override
	void deposite(double amount) {
		super.deposite(amount);
		System.out.println("Deposite in Current: " + amount);
		balance += amount;
		System.out.println("Total Balance in Current " + balance);
	}

}
