package com.lumen.set;
 
import java.util.Arrays;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		NavigableSet<String> set = new TreeSet<>(Arrays.asList("apple", "orange", "mango", "grapes"));
		System.out.println(set);
		
		

		// headset

		SortedSet<String> headdata = set.headSet("mango");
		System.out.println(headdata);

		SortedSet<String> headdata1 = set.headSet("mango", true);
		System.out.println(headdata1);

		SortedSet<String> taildata = set.tailSet("grapes");
		System.out.println(taildata);
		System.out.println();

		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.floor("grapes"));
		System.out.println(set.floor("grape"));
		System.out.println();

		System.out.println(set.ceiling("grapes"));
		System.out.println(set.ceiling("ora"));

	}

}
