package com.array;

public class ReplaceWithNegative {

	public static void replaceWithNegative(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i - 1; j < ar.length; j++) {
				if (ar[i] < 0) {
					ar[i] = ar[j] * ar[j];
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 3, -19, 29, 5, -61, 44, 7, -9 };

		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		replaceWithNegative(arr);
		System.out.println("After replacing:");
		for (int b : arr) {
			System.out.print(b + " ");
		}
	}
}
