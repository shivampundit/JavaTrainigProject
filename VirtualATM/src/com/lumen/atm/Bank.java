package com.lumen.atm;

public abstract class Bank {
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	abstract void withdraw(double amount);
	abstract  void deposite(double amount);
	double getBalance() {
		return balance;
	};

}
