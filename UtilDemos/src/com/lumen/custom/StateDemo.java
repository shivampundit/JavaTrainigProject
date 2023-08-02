package com.lumen.custom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StateDemo {

	public static void main(String[] args) {
		Map<String, List<String>> stateMap = new HashMap<String, List<String>>();
		List<String> karnataka = Arrays.asList("Banglore", "Mysore", "Hubli");

		List<String> rajasthan = Arrays.asList("Jaipur", "Kota", "JodhPur");

		List<String> uttarPradesh = Arrays.asList("Lucknow", "Kanpur", "Noida");
		stateMap.put("Karnataka", karnataka);
		stateMap.put("Rajasthan", rajasthan);
		stateMap.put("Uttar Pradesh", uttarPradesh);

		for (Map.Entry<String, List<String>> entry : stateMap.entrySet()) {
			String state = entry.getKey();
			System.out.println("State " + state);

			for (String city : entry.getValue()) {
				System.out.println("City : " + city);
			}

		}

	}

}
