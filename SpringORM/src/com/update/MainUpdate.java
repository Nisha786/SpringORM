package com.update;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pojo.Employee;
import com.pojo.EmployeeDao;

public class MainUpdate {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		EmployeeDao Dao = (EmployeeDao) factory.getBean("empdao");

		Employee employee = (Employee)factory.getBean("com.pojo.Employee.class", new Integer(106));
		//employee.setId(106);
		employee.setFirstName("Hardik");
		employee.setLastName("Agarwal");
		employee.setCompanyName("Wipro");
		employee.setCity("Indore");
		employee.setIncome(33000.0);

		Dao.updateEmployee(employee);

	}
}
