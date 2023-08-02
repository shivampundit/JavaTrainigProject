package com.oops.overload;


public class VarArgsDemo {
	void calcSum(String name, int... marks) {
		System.out.println("Welcome " + name);
		int sum = 0;

		for (int mark : marks)
			sum += mark;

		System.out.println("Sum " + sum);
		
		}
	public static void main(String[] args) {
		VarArgsDemo demo = new VarArgsDemo();
		demo.calcSum("Shivam" , 90, 80, 70);
		demo.calcSum("Yash");
		demo.calcSum("Roni", 20, 30, 102, 78, 87);
	}
	}

