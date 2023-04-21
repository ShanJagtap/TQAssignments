package com.array;

public class SecondSmallNumber {
	public static void secondMinValue(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = 0; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[1]);
	}

	public static void main(String args[]) {
		int a[] = { -20, 0, -25, 15, 19, 37, 23 };
		secondMinValue(a, 7);
	}
}
