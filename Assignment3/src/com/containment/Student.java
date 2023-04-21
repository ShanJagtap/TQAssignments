package com.containment;

public class Student {
	private int roll;
	private String name;
	private Department department;

	public Student() {

	}

	public Student(int roll, String name, Department department) {
		this.roll = roll;
		this.name = name;
		this.department = department;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Student:" + " " + roll + " " + name + " " + department;
	}
}
