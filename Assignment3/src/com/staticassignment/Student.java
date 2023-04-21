package com.staticassignment;

public class Student {
	private int id;
	private String name;
	private float marks;

	public Student() {

	}

	public Student(int id, String name, float marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public static void studentName(String name) {
		name = "Gaurav";
	}

}
