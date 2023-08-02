package com.oops.basics;

enum VehicleDetails {
	
	HONDA("CITY", 900000), 
	AUDI("A100", 18200000), 
	MAHINDRA("THAR", 1200000),
	BMW("BMW 900", 13823000);
	
	private String  model;
	private double price;

	private VehicleDetails(String model, double price) {
		this.price = price;
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

}

public class EnumWithConstructor {

	public static void main(String[] args) {
		VehicleDetails  vehicle = VehicleDetails.AUDI;
		System.out.println("Model : " + vehicle.getModel());
		System.out.println("Price : " +vehicle.getPrice());
		
		double hondaPrice = VehicleDetails.HONDA.getPrice();
		String modelHonda = VehicleDetails.HONDA.getModel();
		System.out.println("Honda Price : " +hondaPrice);
		System.out.println("Honda Model : " +modelHonda);
		
	}

}
