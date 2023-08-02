package com.lumen.basic;

public class DigitSumAvg {
	public static void main(String[] args) {
		int num = 6548; 
		int mod;
		int sum = 0;
		
		int count = 0;

		while(num>0)
		{
			mod = num % 10;
			sum += mod;
			num /= 10;
			count++;
		}
		
		float avg = (float)sum/count;
		System.out.println(sum);
		System.out.println(avg);
	}
}
