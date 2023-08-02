package com.lumen.inherdemo;

public class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(double amount) {
		System.out.println("Withdraw Amount:");
	}

	void deposite(double amount) {
		System.out.println("Deposite Amount:");
	}

	double getBalance() {
		return balance;
	}
}
