package com.staticassignment;

public class StaticOverload {

	public static void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public static void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		StaticOverload a1 = new StaticOverload();
		a1.add(15, 15);
		a1.add(15, 15, 20);
	}
}
