package com.lumen.basic;

public class Duplicate {

	public static void main(String[] args) {
		int[] duplicates = { 23, 65, 87, 23, 85, 87, 65, 88, 56, 32 };
		for (int i = 0; i < duplicates.length; i++) {
			for (int j = i + 1; j < duplicates.length; j++) {
				if (duplicates[i] == duplicates[j])
					System.out.println("Duplicate value : " + duplicates[i]);

			}
		}
	}

}
