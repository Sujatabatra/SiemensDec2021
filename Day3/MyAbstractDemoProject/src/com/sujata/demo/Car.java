package com.sujata.demo;
/*
 * abstract : can be a method or class
 * 
 * 1. abstract method is sharing contract with the child classes, 
 * that child class must give the implementation of abstract method
 * 
 * 2. If even a single method is marked as abstract then its mandatory
 * for us to mark the class also abstract.
 * 
 * 3.We cannot create the object of abstract class , 
 * but abstract class can be used to act as a base class
 */
abstract public class Car {

	private String model,color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}
	//abstract method don't have any body
	abstract public void engine();
}
