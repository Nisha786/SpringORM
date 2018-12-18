package com.springDemo;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {

	public static void main(String[] args) {

		Resource res = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		Object o = factory.getBean("id3");
		WelcomeBean b = (WelcomeBean) o;

		b.show();
	}

}
