package com.lumen.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemos {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(list.size());
		list.add("Java");
		list.add("100");
		list.add("100.9");
		list.add("Spring");
		list.add("Angular");
		list.add("Maven");
		list.add(1, "Helen");
		System.out.println(list);
		list.add("Priya");
		System.out.println(list.size());
		
		
		Iterator<String> iterator= list.iterator();
		while (iterator.hasNext()) {
			String name =iterator.next();
			System.out.println(name.toUpperCase());
			
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		for(String name: list)
			System.out.println(name.toUpperCase());
		
		System.out.println(list.size());
		list.set(1, "Lucky"); // assign
		list.add(2, "Buddy");  
		
		System.out.println(list.get(2));
		
		System.out.println("Reverse");
		
		ListIterator<String> listIterator = list.listIterator(list.size());
		while (listIterator.hasPrevious()) {
			String name = listIterator.previous();
			System.out.println(name);
			
		}
		
	}
}
