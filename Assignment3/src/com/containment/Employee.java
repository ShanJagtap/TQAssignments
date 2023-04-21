package com.containment;

public class Employee {
	private int empid;
	private String empname;
	private float salary;
	private String dept;

	public Employee() {

	}

	public Employee(int empid, String empname, float salary, String dept) {
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.dept = dept;
	}

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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String toString() {
		return "Employee Details:" + " " + empid + " " + empname + " " + salary + " " + dept;
	}
}
