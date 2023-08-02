package com.lumen.scan;

import java.util.Scanner;

public class GreatestTernary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Three Numbers : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int res = (a>b && a>c ? a: (b > c)? b : c);
		System.out.println("Greates Number :" + res);
	}

}
