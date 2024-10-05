package com.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sept");
		EntityManager entity = factory.createEntityManager();
		
		entity.getTransaction().begin();
		
		Employee emp = new Employee(110,"uday",12345,"hyd");
		Employee emp1 = new Employee(111,"kumar",12000,"gun");
		Employee emp2 = new Employee(112,"nani",12001,"kphb");
		Employee emp3 = new Employee(113,"surya",12002,"goa");
		
//		entity.persist(emp);
//		entity.persist(emp1);
//		entity.persist(emp2);
//		entity.persist(emp3);
		
		// find the data
		TypedQuery<Employee> tq = entity.createQuery("select c from Employee c",Employee.class);
		List<Employee> li = tq.getResultList();
		
		for(Employee e:li)
		{
			System.out.println(e.getEmpadd()+" "+e.getEmpname()+" "+e.getEmpsal());
		}
		
		// update
		Query q = entity.createQuery("update Employee set empsal=empsal+5000 where empsal<12002");
//		q.executeUpdate();
		
		// max salary
		Query q1 =entity.createQuery("select MAX(empsal) from Employee e");
		int maxsal=(int) q1.getSingleResult();
//		System.out.println(maxsal);
		
		// delete
		Query q2=entity.createQuery("delete from Employee where empsal>17000");
		q2.executeUpdate();
		
		entity.getTransaction().commit();
	}
}
