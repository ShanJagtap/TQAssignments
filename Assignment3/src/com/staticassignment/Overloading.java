package com.staticassignment;

public class Overloading {
	private int a;
	private int b;
	private int sum;

	int add(int a, int b) {
		sum = a + b;
		return sum;
	}

	int add(int a, int b, int c) {
		sum = a + b + c;
		return sum;
	}
}
