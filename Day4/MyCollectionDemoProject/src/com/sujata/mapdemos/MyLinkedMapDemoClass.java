package com.sujata.mapdemos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MyLinkedMapDemoClass {

	public static void main(String[] args) {
		/*
		 * LinkedHashMap is Key-Value pair,
		 * where keys are unique and value can be duplicated,,
		 * ORDERED collection as per key
		 */
		Map<String, Integer> months=new LinkedHashMap<String, Integer>();
		
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);
		
		System.out.println("Size of collection of key value pairs :"+months.size());
		System.out.println(months);
		
		months.put("Feb", 29);
		
		System.out.println("Size of collection of key value pairs :"+months.size());
		System.out.println(months);
		
		months.remove("May");
		
		System.out.println("Size of collection of key value pairs :"+months.size());
		System.out.println(months);
		
		Set<String> monthNames=months.keySet();
		for(String month:monthNames) {
			System.out.println(month+" have "+months.get(month)+" days ");
		}
		
		

	}

}
