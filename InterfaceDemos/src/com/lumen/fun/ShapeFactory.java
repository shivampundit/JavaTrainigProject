package com.lumen.fun;

public class ShapeFactory {

	void printArea(Shape shape,double x, double y ) {
		System.out.println("Prnting Area: ");
		shape.calcArea(x, y);
		System.out.println("Done");
	}
	
	
}
