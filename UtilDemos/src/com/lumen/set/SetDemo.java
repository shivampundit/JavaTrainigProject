package com.lumen.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
//		Set<String> hashSet = new HashSet<String>();
		// linked hashset is not sorted
//		Set<String> hashSet = new LinkedHashSet<String>();
		Set<String> hashSet = new TreeSet<String>();

		hashSet.add("Apple");
		hashSet.add("Orange");
		hashSet.add("Banana");
		hashSet.add("Kiwi");
		hashSet.add("100");
//		hashSet.add(null); // treeSet throws nullpointerException
		hashSet.add("Apple"); // duplicate not allowed

//		System.out.println(hashSet);
		System.out.println(hashSet);

		for (String element : hashSet)
			System.out.println(element);

	}
}
