package com.oops.overload;

public class Vehicle {
	String model;
	String brand;
	double price;

	public Vehicle() {
		super();
		System.out.println("No Param: ");
	}

	public Vehicle(String model) {
//		this();
		this.model = model;
		System.out.println("One param : " + model);
	}

	public Vehicle(String model, double price) {
//		this.model = model;
		this(model);
		this.price = price;
		System.out.println("Two param : " + model + " " + price);
	}

	public Vehicle(String model, String brand, double price) {
		this(model, price);
//		this.model = model;
		this.brand = brand;
//		this.price = price;
		System.out.println("Three param : " + model + " " + brand + " " + price);
	}

	void print() {
		if (model != null)
			System.out.println("Model : " + model);
		if (brand != null)
			System.out.println("Brand : " + brand);
		if (price > 0)
			System.out.println("Price : " + price);

	}

}
