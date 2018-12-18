package com.springDemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExampleBean implements InitializingBean, DisposableBean{

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	public ExampleBean(){
		System.out.println("Default Constructor called");
	}

	public void init() {
		System.out.println("Initialization method called");
	} 

	public void afterPropertiesSet() {
		System.out.println("AfterPropertySet method called");
	}

	public void destroy() {
		System.out.println("Destroy method called");
	}

	public void display() {
		System.out.println("Welcome to Spring bean lifecycle!!!");
		System.out.println("Message :" + message);
	}
}
