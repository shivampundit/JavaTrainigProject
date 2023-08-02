package com.lumen.basic;

public class PerfectNumber {

	public static void main(String[] args) {
		int num = 6548;
		int temp = num;
		int mod;
		int sum = 0;

		while (temp > 0) {
			mod = temp % 10;
			sum += mod;
			temp /= 10;
		}

		if (num == sum)
			System.out.println("Number " + num + " is Perfect Number");
		else
			System.out.println("Number " + num + " is not Perfect Number");

	}

}
