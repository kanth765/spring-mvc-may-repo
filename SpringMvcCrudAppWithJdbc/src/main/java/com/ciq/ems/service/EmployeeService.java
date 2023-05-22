package com.ciq.ems.service;

import java.util.List;

import com.ciq.ems.model.Employee;

public interface EmployeeService {
	void save(Employee employee);
	void update(Employee employee);

	void delete(Integer id);

	Employee getById(Integer id);
	
	List<Employee> getAllEmployees();
}
