package com.arraylist2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
	public int compare(Employee o1, Employee o2) {
		if (o1.getSalary() < o2.getSalary())
			return -1;
		else if (o1.getSalary() > o2.getSalary())
			return 1;
		else
			return 0;
	}
}
