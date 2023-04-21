package com.array;

public class ArrangingElements {
	public static void ArrangingElements(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < 0) {
				// ar[i] =
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 3, -19, 29, 5, -61, 44, 7, -9 };

		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		ArrangingElements(arr);
		System.out.println("After arranging:");
		for (int b : arr) {
			System.out.print(b + " ");
		}
	}

}
