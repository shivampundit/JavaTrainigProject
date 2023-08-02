package com.lumen.assignments;

import java.util.Scanner;

public class Registration {
	public static void main(String[] args) {
		String usernames[] = new String[] { "Shivam", "Yash", "Rakshitha", "Saba" };

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter name to Register");

		String name = scanner.next();
		boolean flag = true;
		for (String username : usernames) {
			if (name.equals(username)) {
				System.out.println("Name is not Unique");
				flag = false;
				break;
			}
		}

		if (flag)
			System.out.println("You are Registered");
		scanner.close();
	}

}