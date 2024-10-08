package com.service;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.model.Employee;

public class EmployeeServiceimpl implements EmployeeService{

	private EmployeeDao dao = new EmployeeDaoImpl();
	
	@Override
	public void addEmployee(Employee emp) {
		dao.getTransactionBegin();
		dao.addEmployee(emp);
		dao.getTransactionCommit();
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.getTransactionBegin();
		dao.updateEmployee(emp);
		dao.getTransactionCommit();
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		dao.getTransactionBegin();
		dao.deleteEmployee(emp);
		dao.getTransactionCommit();
		
	}

	@Override
	public Employee findEmployeeById(int empid) {
		Employee emp = dao.getEmployeeById(empid);
		return emp;
	}

}
