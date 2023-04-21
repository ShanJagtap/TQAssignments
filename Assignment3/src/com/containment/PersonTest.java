package com.containment;

import java.util.Scanner;

public class PersonTest {
	public static void main(String args[]) {
		Address a1 = new Address("Pune", "Maharashtra", "india");
		Address a2 = new Address("Mumbai", "Maharashtra", "India");

		Person p1 = new Person("Gaurav", "male", 26, a1);
		Person p2 = new Person("Apurva", "female", 21, a2);

		System.out.println(p1);
		System.out.println(p2);

		Person p3 = new Person();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		p3.setName(sc.next());

		System.out.println("Enter Gender:");
		p3.setGender(sc.next());

		System.out.println("Enter Age:");
		p3.setAge(sc.nextInt());

		System.out.println("Enter Address:");

		System.out.println("Name:" + p3.getName());
		System.out.println("Gender:" + p3.getGender());
		System.out.println("Age:" + p3.getAge());
		// System.out.println("Address:"p3.getAddress());
		sc.close();
	}
}
