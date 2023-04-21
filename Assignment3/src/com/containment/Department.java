package com.containment;

public class Department {
	private int deptId;
	private String deptName;

	public Department() {
		System.out.println("Default constructor");
	}

	public Department(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String toString() {
		return "Department:" + " " + deptId + " " + deptName;
	}
}
