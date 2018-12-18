package com.pojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDao {

	HibernateTemplate template;

	public EmployeeDao() {

	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	// Method to Save Employee
	public void saveEmployee(Employee emp) {
		template.save(emp);
	}

	// Method to Update Employee
	public void updateEmployee(Employee emp) {
		template.update(emp);
	}

	// Method to Delete Employee
	public void deleteEmployee(Employee emp) {
		template.delete(emp);
	}

	// Method to Return One Employee of given Id
	public Employee getById(Integer id) {
		Employee e = (Employee) template.get(Employee.class, new Integer(id));
		return e;
	}

	// Method to Return all Employees
	public List getEmployees() {
		List list = new ArrayList();
		list = template.loadAll(Employee.class);
		return list;
	}
}
