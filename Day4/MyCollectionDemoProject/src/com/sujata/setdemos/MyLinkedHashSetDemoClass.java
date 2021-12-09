package com.sujata.setdemos;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class MyLinkedHashSetDemoClass {

	public static void main(String[] args) {
		/*
		 * LinkedHashSet is the ORDERED unique collection of objects
		 * and collection is auto growable and auto shrinkable
		 */
		Set<Integer> collection=new LinkedHashSet<Integer>();
		
		System.out.println("Size of my Collection : "+collection.size());
		System.out.println(collection);
		
		collection.add(new Integer(10));
		collection.add(new Integer(30));
		collection.add(new Integer(90));
		collection.add(new Integer(20));
		collection.add(30);
		
		System.out.println("Size of my Collection : "+collection.size());
		System.out.println(collection);
		
		collection.remove(30);

		System.out.println("Size of my Collection : "+collection.size());
		System.out.println(collection);
		
		System.out.println("Traversal using for each loop");
		for(Integer element:collection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator Interface");
		Iterator<Integer> iterator=collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
