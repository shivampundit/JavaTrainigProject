package com.lumen.custom;

public class CustomMain {

	public static void main(String[] args) {
		System.out.println("in custom Main");
		CustomBank customBank = new CustomBank(2000);
		try {
			customBank.withdraw(900);
		} catch (Exception e) {
			System.out.println("Try again");
			System.out.println(e.getMessage()); 
		}
//		System.out.println("Amount Withdrawn");
	}

}
