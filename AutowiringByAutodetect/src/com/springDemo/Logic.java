package com.springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Logic {

	public static void main(String[] args) {

		Resource res = new ClassPathResource("spconfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		Object o = factory.getBean("id1");
		Categories wb = (Categories) o;

		wb.show();
	}

}
