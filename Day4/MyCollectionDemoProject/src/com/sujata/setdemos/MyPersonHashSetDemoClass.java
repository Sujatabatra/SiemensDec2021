package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.sujata.bean.Person;

public class MyPersonHashSetDemoClass {

	public static void main(String[] args) {
		/*
		 * All list classes are indexed
		 * ======================================
		 * ArrayList is the ORDERED collection of objects, 
		 * which allows us to storo duplicate objects as well,
		 * and collection is auto growable and auto shrinkable
		 */
		Set<Person> collection=new HashSet<Person>();
		
		System.out.println("Size of my Collection : "+collection.size());
		System.out.println(collection);
		
		collection.add(new Person(101, "AAAA", 44));
		collection.add(new Person(102, "BBBB", 32));
		collection.add(new Person(103, "CCCC", 56));
		collection.add(new Person(104, "DDDD", 22));
		collection.add(new Person(101, "AAAA", 44));
		
		System.out.println("Size of my Collection : "+collection.size());
		System.out.println(collection);
		
		collection.remove(2);

		System.out.println("Size of my Collection : "+collection.size());
		System.out.println(collection);
		
		
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
		
		
			
		
	}

}
