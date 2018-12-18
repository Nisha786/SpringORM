package com.pojo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		EmployeeDao Dao = (EmployeeDao) factory.getBean("empdao");

		Employee employee = new Employee();
		employee.setId(101);
		employee.setFirstName("Shivi");
		employee.setLastName("Gupta");
		employee.setCompanyName("RBL");
		employee.setCity("Indore");
		employee.setIncome(35000.0);

		Dao.saveEmployee(employee);

	}
}
