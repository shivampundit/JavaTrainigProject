package com.lumen.atm;

import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String check = null;
		do {
			System.out.println("Enter Your Account Type: \nType 1 for saving Account \nType 2 for Current Account");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				Bank saccount = new Savings(22000);
				System.out.println("Enter 1 for deposite, 2 for withdraw, 3 for check balance:");
				int choiceIn = scanner.nextInt();
				switch (choiceIn) {
				case 1:
					System.out.println("Enter Amount to Deposite: ");
					double amount = scanner.nextInt();
					saccount.deposite(amount);
					break;
				case 2:
					System.out.println("Enter Amount to Withdraw: ");
					amount = scanner.nextInt();
					saccount.withdraw(amount);
					break;
				case 3:
					saccount.getBalance();
					break;

				default:
					System.out.println("Please Select Correct Opotion");
				}

				System.out.println("Thank you for your transaction!");
				break;

			case 2:
				Bank caccount = new Current(23000);
				System.out.println("Enter 1 for deposite, 2 for withdraw, 3 for check balance:");
				int choiceIn2 = scanner.nextInt();
				switch (choiceIn2) {
				case 1:
					System.out.println("Enter Amount to Deposite: ");
					double amount = scanner.nextInt();
					caccount.deposite(amount);
					break;
				case 2:
					System.out.println("Enter Amount to Withdraw: ");
					amount = scanner.nextInt();
					caccount.withdraw(amount);
					break;
				case 3:
					caccount.getBalance();
					break;

				default:
					System.out.println("Please Select Correct Opotion");
				}

				System.out.println("Thank you for your transaction!");
				break;

			default:
				System.out.println("Please Select Your Account Type");
			}
			System.out.println("Do you want to continue: Press yes ");
			check = scanner.next();
		} while (check != "yes");

	}

}
