package com.lumen.scan;

import java.util.Scanner;

public class ArraySqrt {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Array Length: ");
	int n = scanner.nextInt();
	
	int[] arr = new int[n];
	
	System.out.println("Enter Array elements: ");
	for (int i = 0; i < arr.length; i++) {
		arr[i] = scanner.nextInt();
	}
	
	for (int i = 0; i < arr.length; i++) {
		int res = (int)arr[i];
		arr[i] = (int) Math.sqrt(res);
	}
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]+ " ");
	}
	
	
	
	}

}
