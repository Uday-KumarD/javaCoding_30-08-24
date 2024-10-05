package com.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="social")
public class Employee {

	@Id
	@Column(name="enum",length=10)
	private int empid;
	@Column(name="name",length=10)
	private String empname;
	@Column(name="salary",length=10)
	private int empsal;
	@Column(name="address",length=10)
	private String empadd;
	
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	public String getEmpadd() {
		return empadd;
	}
	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}
	public Employee(int empid, String empname, int empsal, String empadd) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empadd = empadd;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", empadd=" + empadd + "]";
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
}
