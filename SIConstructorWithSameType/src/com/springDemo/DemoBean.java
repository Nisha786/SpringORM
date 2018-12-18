package com.springDemo;

public class DemoBean {

	public String uName, password;

	public DemoBean(String uName, String password) {
		this.uName = uName;
		this.password = password;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void show()
	{
		System.out.println("Constructor with same type argument");
	}
}
