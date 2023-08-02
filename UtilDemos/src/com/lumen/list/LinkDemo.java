package com.lumen.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator; 

public class LinkDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		System.out.println(list.size());
		list.add("Java");
		list.add("Spring");
		list.add("Angular");
//		list.add("Maven");
//		list.addFirst("HTML");
//		list.addLast("CSS");
		System.out.println(list);
//		list.add("Priya");
		System.out.println(list.size());
		
	/*
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
		*/
		
		System.out.println("Methods");
		System.out.println(list.peek());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.peek());
//		System.out.println(list.remove());
		
		
	}
}
