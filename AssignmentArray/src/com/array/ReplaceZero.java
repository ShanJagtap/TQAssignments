package com.array;

public class ReplaceZero {

	public static void replaceZeroWithOne(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				ar[i] = 1;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34 };

		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		replaceZeroWithOne(arr);
		System.out.println("After replacing:");
		for (int b : arr) {
			System.out.print(b + " ");
		}
	}
}
