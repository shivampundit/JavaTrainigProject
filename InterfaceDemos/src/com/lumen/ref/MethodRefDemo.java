package com.lumen.ref;

interface AreaCalculator {
	void calcArea(double x, double y);
}

interface NameChecker {
	String checkName(String name);
}

class Shape {
	public void rectArea(double x, double y) {
		System.out.println("Rect : " + (x * y));
	}

	public static void triArea(double x, double y) {
		System.out.println("Tri : " + (x * y));
	}
}

class Details {
	public String showName(String name) {
		if (name.equals("Shivam"))
			return "Hello " + name;
		return name;
	}
}




public class MethodRefDemo {
	public static void main(String[] args) {
		// using lambda
		AreaCalculator areaCalculator = (x, y) -> System.out.println("Area : " + x * y);
		areaCalculator.calcArea(20, 10);

		// ref to a non static method

		Shape myShape = new Shape();
		areaCalculator = myShape::rectArea;
		areaCalculator.calcArea(22, 8);

		//ref to static method
		areaCalculator = Shape::triArea;
		areaCalculator.calcArea(18, 28);

		NameChecker nameChecker = (name) -> {
			System.out.println("Name : " + name);
			return name;
		};

		nameChecker.checkName("Shivam");

		Details details = new Details();
		nameChecker = details::showName;
		System.out.println(nameChecker.checkName("Shivam"));
	}

}
