package com.springDemo;

import java.util.Set;

public class WelcomeBean {

	private Set studentsData;

	public void setStudentsData(Set studentsData) {
		this.studentsData = studentsData;
	}

	public void show() {

		System.out.println(studentsData);
	}

}
