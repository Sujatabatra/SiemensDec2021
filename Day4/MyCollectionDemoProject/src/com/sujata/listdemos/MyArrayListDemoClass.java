package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayListDemoClass {

	public static void main(String[] args) {
		/*
		 * All list classes are indexed
		 * ======================================
		 * ArrayList is the ORDERED collection of objects, 
		 * which allows us to storo duplicate objects as well,
		 * and collection is auto growable and auto shrinkable
		 */
		List<Integer> collection=new ArrayList<Integer>();
		
		System.out.println("Size of my Collection : "+collection.size());
		System.out.println(collection);
		
		collection.add(new Integer(10));
		collection.add(new Integer(30));
		collection.add(new Integer(90));
		collection.add(new Integer(20));
		collection.add(30);
		
		System.out.println("Size of my Collection : "+collection.size());
		System.out.println(collection);
		
		collection.remove(new Integer(30));

		System.out.println("Size of my Collection : "+collection.size());
		System.out.println(collection);
		
		System.out.println("Traversal using Traditional for loop ");
		for(int index=0;index<collection.size();index++) {
			System.out.println(collection.get(index));
		}
		
		System.out.println("Traversal using for each loop");
		for(Integer element:collection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator Interface");
		/*
		 * Iterator is forward iterator only : hasNext(), next()
		 */
		Iterator<Integer> iterator=collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Reverse Traversal using ListIterator");
		/*
		 * ListIterator is both direction i.e forward and backward direction iterator : hasNext(),next(),hasPrevious(),previous()
		 */
		ListIterator<Integer> listIterator=collection.listIterator();
		while(listIterator.hasNext()) {
			listIterator.next();
		}
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
			
		
	}

}
