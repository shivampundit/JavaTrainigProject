package com.lumen.fun;

public class ShapeMain {
	public static void main(String[] args) {
		ShapeFactory shapefactory = new ShapeFactory();

		shapefactory.printArea((x, y) -> {
			System.out.println("Area Rectangle : " + (x * y));
			return x * y;
		}, 12, 8);

		shapefactory.printArea((x, y) -> {
			System.out.println("Area Triange: " + (0.5*x * y));
			return (0.5*x * y);
		}, 12, 8);

	}
}
