package com.oops.override;

public class ShaperDemo {

	public static void main(String[] args) {
		Shaper shaper = new Triangle();
		shaper.area(12, 25);
		shaper.greet();
		shaper = new Rectange();
		shaper.area(10, 20);
	}

}
