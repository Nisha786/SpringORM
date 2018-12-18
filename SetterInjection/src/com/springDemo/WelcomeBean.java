package com.springDemo;

public class WelcomeBean {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void show()
	{
		System.out.println(message);
	}
}
