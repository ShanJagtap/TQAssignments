package com.arraylist2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListOfEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();

		emp.add(new Employee(11, "Gaurav", 35000));
		emp.add(new Employee(20, "Sahil", 60000));
		emp.add(new Employee(3, "Rushikesh", 45000));
		emp.add(new Employee(14, "Akash", 40000));

		System.out.println(emp);

		Collections.sort(emp, new SalaryComparator());

		Iterator<Employee> itr = emp.iterator();
		while (itr.hasNext()) {
			Employee emp2 = itr.next();
			System.out.println(emp2);
		}

		System.out.println("=====================================");
		Collections.sort(emp, new NameComparator());
		System.out.println(emp);

		Collections.sort(emp, new IdComparator());
		System.out.println(emp);
	}

}
