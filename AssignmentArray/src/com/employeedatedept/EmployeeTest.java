package com.employeedatedept;

import java.util.Scanner;

public class EmployeeTest {
	static Scanner sc = new Scanner(System.in);

	public static void employeeDetails(Employee e) {
		System.out.println("Enter Employee id:");
		e.setEmp_id(sc.nextInt());

		System.out.println("Enter Employee name:");
		e.setEmp_name(sc.next());

		System.out.println("Enter Employee salary:");
		e.setSalary(sc.nextDouble());

		e.setDate(new MyDate());
		System.out.println("Enter day:");
		e.getDate().setDay(sc.next());

		System.out.println("Enter month:");
		e.getDate().setMonth(sc.next());

		System.out.println("Enter year:");
		e.getDate().setYear(sc.next());

		e.setDept(new Department());
		System.out.println("Enter dept id:");
		e.getDept().setDid(sc.nextInt());

		System.out.println("Enter dept name:");
		e.getDept().setDname(sc.next());
	}

	public static void main(String args[]) {
		Employee emp[] = new Employee[3];

		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee();
			employeeDetails(emp[i]);
			System.out.println(emp[i]);
		}
	}
}
