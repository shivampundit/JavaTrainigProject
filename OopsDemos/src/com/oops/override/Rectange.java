package com.oops.override;

public class Rectange extends Shaper {

	@Override
	void area(int x, int y) {
		System.out.println("Area of Rectangle: " + x*y );
	}
	
}
