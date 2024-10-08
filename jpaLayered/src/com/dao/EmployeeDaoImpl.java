package com.dao;

import javax.persistence.EntityManager;

import com.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private EntityManager entity;
	
	public EmployeeDaoImpl() {
		entity = JPAUtil.getEntityManager();
	}
	
	@Override
	public Employee getEmployeeById(int empid) {
		Employee emp = entity.find(Employee.class, empid);
		return emp;
	}

	@Override
	public void addEmployee(Employee emp) {
		entity.persist(emp);
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		entity.merge(emp);
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		entity.remove(emp);
		
	}

	@Override
	public void getTransactionBegin() {
		entity.getTransaction().begin();
		
	}

	@Override
	public void getTransactionCommit() {
		entity.getTransaction().commit();
		
	}

	
}
