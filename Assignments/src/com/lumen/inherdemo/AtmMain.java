package com.lumen.inherdemo;

import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Account Type: \nType 1 for saving Account \nType 2 for Current Account");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			Account saccount = new Savings(22000);
			System.out.println("Enter Amount to Deposite: ");
			double amount = scanner.nextInt();
			saccount.deposite(amount);
			System.out.println("Enter Amount to Withdraw: ");
			amount = scanner.nextInt();
			saccount.withdraw(amount);
			saccount.getBalance();
			System.out.println("Thank you for your transaction!");
			break;
		case 2:
			Account caccount = new Current(23000);
			System.out.println("Enter Amount to Deposite: ");
			double amount1 = scanner.nextInt();
			caccount.deposite(amount1);
			System.out.println("Enter Amount to Withdraw: ");
			amount1 = scanner.nextInt();
			caccount.withdraw(amount1);
			caccount.getBalance();
			System.out.println("Thank you for your transaction!");
			break;

		default:
			System.out.println("Please Select Your Account Type");
		}

	}

}
