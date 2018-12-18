package com.springDemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// Read the Configuration file using ApplicationContext
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Get the InitializeDestroyExample class instance
		ExampleBean b = (ExampleBean) applicationContext.getBean("init");
		// Call the display() method
		b.display();

		// Closing the context
		applicationContext.close();
	}

}
