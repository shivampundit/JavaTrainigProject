package com.lumen.atm;

public class Account extends Bank{
	double balance;

	public Account(double balance) {
		super(balance);
		this.balance = balance;
	}

	void withdraw(double amount) {
		System.out.println("Withdraw Amount:");
	}

	double getBalance() {
		return balance;
	}

	@Override
	void deposite(double amount) {
		System.out.println("Deposite Amount:");
	}

	
}
