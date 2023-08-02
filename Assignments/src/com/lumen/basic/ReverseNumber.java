package com.lumen.basic;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 6548;
		int mod;
		int reverse = 0;

		while (num > 0) {
			mod = num % 10;
			reverse = reverse * 10 + mod;
			num /= 10;

		}

		System.out.println(reverse);

	}

}
