package EmployeeCaseStudy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
		
		HashMap<Integer,Employee> employee = new HashMap<Integer,Employee>();
		
		int empid = 785421465-681475454;
		
		while(true)
		{
		System.out.println("**** Employee Mangement Application ****");
		
		System.out.println("1.Add Employee");
		System.out.println("2.Update Employee");
		System.out.println("3.Get Employee");
		System.out.println("4.Delete Employee");
		System.out.println("5.Get All Employees");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		switch(option)
		{
		    case 1:
		    	System.out.println("**** Add Employee ****");
		    	
		    	System.out.println("Enter Employee Name");
		    	String empName = sc.next();
		    	System.out.println("Enter Employee Salary");
		    	int empSal = sc.nextInt();
		    	System.out.println("Enter Employee 	Address");
		    	String empAdd = sc.next();
		    	System.out.println("Enter Employee Email Id");
		    	String empMail = sc.next();
		    	
		    	Employee emp = new Employee(empName, empSal, empAdd, empMail);
		    	
		    	employee.put(++empid, emp);
		    	System.out.println("Employee Added Successfully :"+empid);
		    	
		    	break;
		    	
		    case 2:
		    	System.out.println("**** Update Employee ****");
		    	
		    	System.out.println("Enter Employee Id");
		    	int eid = sc.nextInt();
		    	
		    	System.out.println("Enter Employee Name");
		    	String eName = sc.next();
		    	System.out.println("Enter Employee Salary");
		    	int eSal = sc.nextInt();
		    	System.out.println("Enter Employee 	Address");
		    	String eAdd = sc.next();
		    	System.out.println("Enter Employee Email Id");
		    	String eMail = sc.next();
		    	
		    	Employee emp1 = new Employee(eName,eSal,eAdd,eMail);
		    	employee.put(eid, emp1);
		    	
		    	System.out.println("Employee Updated Successfully :"+eid);
		    	
;		    	break;

		    case 3:
		    	System.out.println("**** Get Employee ****");
		    	
		    	System.out.println("Enter Employee Id");
		    	int eid1 = sc.nextInt();
		    	Employee empobj = employee.get(eid1);
		    	System.out.println(empobj);
		    	
		    	break;
		    	
		    case 4:
		    	System.out.println("**** Delete Employee ****");
		    	System.out.println("Enter Employee Id");
		    	int eid2 = sc.nextInt();
		    	employee.remove(eid2);
		    	System.out.println("Employee Deleted Successfully :"+eid2);
		    	
		    	break;
		    	
		    case 5:
		    	System.out.println("**** Get All Employees ****");
		    	
		    	Set<Entry<Integer,Employee>> result = employee.entrySet();
		    	Iterator<Entry<Integer,Employee>> itr = result.iterator();
		    	while(itr.hasNext())
		    	{
		    		Entry<Integer,Employee> finalResult = itr.next();
		    		System.out.println(finalResult.getKey()+" "+finalResult.getValue());
		    	}
		    	break;
		    	
		    default:
		        System.out.println("");
		    
		}
		
		}
	}
}
