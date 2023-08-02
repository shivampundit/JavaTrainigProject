package com.voterapp.main;

import java.util.Scanner;

import com.voterapp.exception.InvalidVoterException;
import com.voterapp.service.ElectionBoothImpl;

public class Voter {
	public static void main(String[] args) throws InvalidVoterException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter your Age:");
		int age = scanner.nextInt();
		System.out.println("Please Enter your Locality:");
		String locality = scanner.next();
		System.out.println("Please Enter your VoterID:");
		int voterID = scanner.nextInt();
		
		
		ElectionBoothImpl electionBoothImpl = new ElectionBoothImpl();
		try {
			if(electionBoothImpl.checkEligibility(age, locality, voterID))
				System.out.println("You are eligible to Vote!");
			
		} catch (InvalidVoterException e) {
//			System.out.println(e.getMessage());
		}
		
		
	}

}
