package com.client;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceimpl;

public class Test {

	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeServiceimpl();
		
		Employee emp = new Employee(101, "uday", 120000, "hyd");
		
//		service.addEmployee(emp);
		
		Employee emp1 = service.findEmployeeById(101);
		
		emp1.setEmpadd("guntur");
		emp1.setEmpname("akshay");
		
//		service.updateEmployee(emp1);
		service.deleteEmployee(emp1);
		
		
	}
}
