package com.springDemo;

public class Cafe {

	private Integer year;
	private String name;

	public Cafe(Integer year, String name) {
		System.out.println("Constructor with Type");
		this.year = year;
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Inside DisplayInfo");
		System.out.println("year :" + year);
		System.out.println("name :" + name);
	}
}
