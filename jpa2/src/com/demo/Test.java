package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sept");
		
		EntityManager entity = factory.createEntityManager();
		
		entity.getTransaction().begin();
		
		Employee emp = new Employee(123,"bahu",30000,"hyd");
		
//		entity.persist(emp);
		
		Employee emp1 = entity.find(Employee.class, 123);
		System.out.println(emp1.getEmpadd());
		System.out.println(emp1.getEmpname());
		System.out.println(emp1.getEmpsal());
		System.out.println(emp1.getEmpid());
		
		emp1.setEmpadd("guntur");
//		entity.merge(emp1); // updates
		
		entity.remove(emp1); // deletes
		
		entity.getTransaction().commit();
	}
}
