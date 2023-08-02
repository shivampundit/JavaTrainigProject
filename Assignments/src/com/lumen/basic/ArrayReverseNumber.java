package com.lumen.basic;

public class ArrayReverseNumber {

	public static void main(String[] args) {
		int arr[] = { 12, 54, 65, 42, 28 };
		
		int length = arr.length;
		int start = 0;
		int end = length-1;
		int temp;
		while(start <= length/2) {
			temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
		
		for (int element : arr) {
			System.out.println(element);
		}

	}

}
