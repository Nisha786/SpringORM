package com.springDemo;

import java.util.List;

public class WelcomeBean {

	public List studentsData;

	public void setStudentsData(List studentsData) {
		this.studentsData = studentsData;
	}
	public void show()
	{
		System.out.println(studentsData);
	}
}
