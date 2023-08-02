package com.userapp.client;

import java.util.Scanner;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.ValidationServiceImpl;

public class Register {

	public static void main(String[] args) throws NameExistsException, TooLongException, TooShortException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String username = scanner.next();
		ValidationServiceImpl validationServiceImpl = new ValidationServiceImpl();

		try {
			validationServiceImpl.validateUsername(username);
		} catch (NameExistsException e) {

			System.out.println(e.getMessage());
		}

		System.out.println("Enter Password: ");
		String password = scanner.next();

		try {
			validationServiceImpl.validatePassword(password);
		} catch (TooLongException | TooShortException e) {
			System.out.println(e.getMessage());
		}

		if (validationServiceImpl.validateUsername(username) && validationServiceImpl.validatePassword(password)) {
			System.out.println("Welcome User");
		}

	}

}
