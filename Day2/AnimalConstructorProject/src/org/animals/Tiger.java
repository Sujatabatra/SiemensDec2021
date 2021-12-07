package org.animals;

public class Tiger {

	private String color;
	private int age;
	private int weight;
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public boolean isVegetarian() {
		return false;
	}
	public boolean canClimb() {
		return false;
	}
	public void sound() {
		System.out.println(" Tiger is of "+color+" of age  "+age+" weighted "+weight+"make sound Roar!");
	}
}
