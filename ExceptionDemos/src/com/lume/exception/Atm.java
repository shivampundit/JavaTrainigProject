package com.lume.exception;

public class Atm {

	public static void main(String[] args) {
		System.out.println("in ATM");
		Bank bank = new Bank(8000);
		try {
			bank.withdraw(2000);
		} catch (Exception e) {
			System.out.println("Try again");
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		System.out.println("Amount Withdrawn");
	}

}
