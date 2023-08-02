package com.lumen.assignments;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String usernames[] = new String[] { "Shivam", "Yash", "Rakshitha", "Saba" };

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter username to Login");

		String name = scanner.next();
		boolean flag = true;
		for (String username : usernames) {
			if (name.equals(username)) {
				System.out.println("You are logged In Successfully");
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("Invalid Entry");
	}
}
