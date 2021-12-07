package org.animals;

public class Lion {
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
		return true;
	}
	public void sound() {
		System.out.println(" Lion is of "+color+" of age  "+age+" weighted "+weight+"make sound Roar!");
	}

}
