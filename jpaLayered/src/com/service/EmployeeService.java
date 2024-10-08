package com.service;

import com.model.Employee;

public interface EmployeeService {

	void addEmployee(Employee emp);
	
	void updateEmployee(Employee emp);
	
	void deleteEmployee(Employee emp);
	
	Employee findEmployeeById(int empid);
}
