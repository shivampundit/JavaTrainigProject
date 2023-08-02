package com.oops.overload;

public class Shape {
	void calcArea(int length) {
		System.out.println("Square : "+ length*length);
	}
	int calcArea(int length, int breadth) {
//		System.out.println("Rectangle : "+ length*breadth);
		return length*breadth;
	}
	void calcArea(double radius) {
		System.out.println("Circle : "+  Math.PI*Math.pow(radius, 2));
	}
	double calcArea(double base, int length) {
//		System.out.println("Triangle : "+ 0.5*base*length);
		return 0.5*base*length;
	}

}