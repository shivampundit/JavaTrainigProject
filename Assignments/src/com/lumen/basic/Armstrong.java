package com.lumen.basic;

public class Armstrong {

	public static void main(String[] args) {
		int num = 153;
		int tempNum = num;
		int mod;
		int sum = 0;

		while (tempNum > 0) {
			mod = tempNum % 10;
			sum += +mod * mod * mod;
			tempNum /= 10;

		}
		if (num == sum)
			System.out.println("Number " + num + " is Armstrong");
		else
			System.out.println("Number " + num + " is not Armstrong");
	}

}
