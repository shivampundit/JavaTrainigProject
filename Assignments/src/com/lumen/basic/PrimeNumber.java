package com.lumen.basic;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 50;
		int i, j;
		boolean flag;
		for (i = 2; i < n; i++) {
			flag = true;
			for (j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}

			}
			if (flag)
				System.out.print(i + ", ");
		}
	}

}
