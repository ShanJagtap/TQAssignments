package com.staticassignment;

public class OverloadingTest {
	public static void main(String args[]) {
		Overloading o1 = new Overloading();
		System.out.println("Sum:" + o1.add(25, 55));
		System.out.println("Sum:" + o1.add(25, 35, 45));

	}
}
