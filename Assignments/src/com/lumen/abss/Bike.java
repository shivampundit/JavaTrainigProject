package com.lumen.abss;

public class Bike extends Vehicle {
	String engineType;
	

	public Bike(String model, String brand, double price, String engineType) {
		super(model, brand, price);
		this.engineType = engineType;
	}

	@Override
	void getMileage() {
		
	}

	@Override
	void showType() {

	}
	
	void engineType() {
		System.out.println(engineType);
		
	}
	
	

}
