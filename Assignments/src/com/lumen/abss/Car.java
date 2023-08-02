package com.lumen.abss;

public class Car extends Vehicle {
	String accessories[];
	public Car(String model, String brand, double price, String[] accessories) {
		super(model, brand, price);
		this.accessories = accessories;
	}



	@Override
	void getMileage() {

	}

	@Override
	void showType() {

	}
	
	void showAccessories() {
		for (String elements : accessories) {
			System.out.print(elements + "\t");
		}
		
	}

}
