package com.springDemo;

public class DemoBean {

	public int id;
	public String uName;
	public DemoBean(int id, String uName)
	{
		this.id =id;
		this.uName = uName;
	}
	
	public DemoBean(String uName, int id)
	{
		this.id = id;
		this.uName = uName;
	}
	
	public void show()
	{
		System.out.println("Dependency in the form of object");
	}
}
