package com.lumen.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("A1", "Audi", 14798998);
		Vehicle vehicle2 = new Vehicle("Thar", "Mahindra", 1979899);
		Vehicle vehicle3 = new Vehicle("City", "Honda", 879898);
		Vehicle vehicle4 = new Vehicle("Suzuki", "Maruti", 779998);

		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(vehicle1);
		vehicles.add(vehicle2);
		vehicles.add(vehicle3);
		vehicles.add(vehicle4);

		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
		System.out.println("List of Vehicles - BrandSort:");
		Comparator<Vehicle> comparator = new BrandSort();
		Collections.sort(vehicles, comparator);
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
		System.out.println("Sorting Using model");
		Collections.sort(vehicles, new ModelSort());
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
		System.out.println("Sorting Using Price");
		Collections.sort(vehicles, new PriceSort());
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}

	}

}
