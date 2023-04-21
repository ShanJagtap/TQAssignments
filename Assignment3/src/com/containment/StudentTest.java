package com.containment;

public class StudentTest {

	public static void main(String[] args) {
		Department d1 = new Department(101, "Information Technology");
		Department d2 = new Department(102, "BCA");

		Student s1 = new Student(14, "Gaurav", d1);
		Student s2 = new Student(14, "Apurva", d2);

		System.out.println(s1);
		System.out.println(s2);
	}

}
