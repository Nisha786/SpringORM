package com.springDemo;

public class Categories {

	private String name;
	private Book bk;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBk() {
		return bk;
	}

	public void setBk(Book bk) {
		this.bk = bk;
	}

	public void show() {
		System.out.println("Category name :" + name);
		System.out.println("Book name :" + bk.getBookName() + " and Book Price :" + bk.getBookPrice());
	}
}
