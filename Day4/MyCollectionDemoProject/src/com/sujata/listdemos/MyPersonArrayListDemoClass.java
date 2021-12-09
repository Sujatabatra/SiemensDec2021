package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.sujata.bean.Person;

public class MyPersonArrayListDemoClass {

	public static void main(String[] args) {
		/*
		 * All list classes are indexed
		 * ======================================
		 * ArrayList is the ORDERED collection of objects, 
		 * which allows us to storo duplicate objects as well,
		 * and collection is auto growable and auto shrinkable
		 */
		List<Person> collection=new ArrayList<Person>();
		
		System.out.println("Size of my Collection : "+collection.size());
		System.out.println(collection);
		
		collection.add(new Person(101, "AAAA", 44));
		collection.add(new Person(102, "BBBB", 32));
		collection.add(new Person(103, "CCCC", 56));
		collection.add(new Person(104, "DDDD", 22));
		collection.add(new Person(101, "AAAA", 28));
		
		System.out.println("Size of my Collection : "+collection.size());
		System.out.println(collection);
		
		collection.remove(2);

		System.out.println("Size of my Collection : "+collection.size());
		System.out.println(collection);
		
		System.out.println("Traversal using Traditional for loop ");
		for(int index=0;index<collection.size();index++) {
			System.out.println(collection.get(index));
		}
		
		System.out.println("Traversal using for each loop");
		for(Person element:collection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator Interface");
		/*
		 * Iterator is forward iterator only : hasNext(), next()
		 */
		Iterator<Person> iterator=collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Reverse Traversal using ListIterator");
		/*
		 * ListIterator is both direction i.e forward and backward direction iterator : hasNext(),next(),hasPrevious(),previous()
		 */
		ListIterator<Person> listIterator=collection.listIterator();
		while(listIterator.hasNext()) {
			listIterator.next();
		}
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
			
		
	}

}
