package EmployeeCaseStudy;

public class Employee {

	private String empName;
	private int empSal;
	private String empAdd;
	private String empMail;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, int empSal, String empAdd, String empMail) {
		super();
		this.empName = empName;
		this.empSal = empSal;
		this.empAdd = empAdd;
		this.empMail = empMail;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSal=" + empSal + ", empAdd=" + empAdd + ", empMail=" + empMail
				+ "]";
	}
	
	
}
