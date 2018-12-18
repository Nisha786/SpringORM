package com.springDemo;

public class Cafe {

	private Bar bar;
	private Baz baz;

	public Cafe(Bar bar, Baz baz) {
		System.out.println("Constructor with left to right");
		this.bar = bar;
		this.baz = baz;
	}

	public void displayInfo() {
		System.out.println("Inside DisplayInfo");
		System.out.println("Bar :" + bar);
		System.out.println("Baz :" + baz);
	}
}
