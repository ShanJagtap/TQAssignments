package com.array;

public class DuplicateArray {
	public static void duplicateArray(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.print(ar[j] + " ");
				}
			}
		}
	}

	public static void main(String args[]) {
		int arr[] = { 3, 10, 90, 78, 56, 10, 78, 34, 61 };

		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		duplicateArray(arr);
	}
}
