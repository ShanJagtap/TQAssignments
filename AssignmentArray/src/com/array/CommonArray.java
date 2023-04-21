package com.array;

public class CommonArray {
	public static void commonElement(int ar[], int ar2[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar2.length; j++) {
				if (ar[i] == ar2[j]) {
					System.out.print(ar2[j] + " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr1[] = { 12, 23, 34, 67, 78, 91, 56 };
		int arr2[] = { 39, 25, 15, 23, 55, 91 };

		for (int a : arr1) {
			System.out.print(a + " ");
		}
		System.out.println();
		for (int b : arr2) {
			System.out.print(b + " ");
		}
		System.out.println();
		commonElement(arr1, arr2);
	}
}
