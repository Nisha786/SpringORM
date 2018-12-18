package com.springDemo;

public class Car {

	private Integer year;
	private String name;

	public Car(Integer year, String name) {
		System.out.println("Constructor with Index");
		this.year = year;
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("year :" + year);
		System.out.println("name :" + name);
	}
}
