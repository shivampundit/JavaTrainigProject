package com.lumen.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap();
		hashMap.put(1, "Java");
		hashMap.put(10, "Spring");
		hashMap.put(8, "Node");
		hashMap.put(null, "CSS");
		hashMap.put(3, "Angular");
		hashMap.put(5, "HTML");
		hashMap.put(1, "React");
		hashMap.put(100, "null");
		hashMap.put(101, "null");

		System.out.println(hashMap);

		System.out.println(hashMap.get(1)); // pass key and get value
		System.out.println(hashMap.get(20)); // returns null value
		System.out.println(hashMap.getOrDefault(20, "Node"));
		System.out.println(hashMap.containsKey(1)); // return true or false

		System.out.println();
		Set<Integer> keys = hashMap.keySet();
		for (Integer key : keys) {
			System.out.println(key + " " + hashMap.get(key));

		}
		System.out.println();

		Set<java.util.Map.Entry<Integer, String>> map = hashMap.entrySet();
		for (java.util.Map.Entry<Integer, String> entry : map) {
			System.out.print(entry.getKey() + " ");
			System.out.println(entry.getValue());
		}
		System.out.println();

		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " " + val);

		}

	}

}
