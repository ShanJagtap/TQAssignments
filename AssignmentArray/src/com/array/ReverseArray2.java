package com.array;

public class ReverseArray2 {
	public static void reverse(int ar[]) {
		int temp[] = new int[ar.length];
		int j = 0;
		for (int i = (ar.length - 1); i >= 0; i--) {
			i = 0;
			temp[j++] = ar[i];
		}
		printArray(temp);

		for (int i = 0; i < ar.length; i++) {
			ar[i] = temp[i];
		}
	}

	static void printArray(int ar[]) {
		for (int i : ar) {
			System.out.println(i + " ");
		}
	}

	public static void main(String args[]) {
		int arr[] = { 7, 3, 5, 1, 2, 9 };
		System.out.println("Array:");
		printArray(arr);

		System.out.println();

		reverse(arr);
		System.out.println();
		System.out.println("Reverse:");
		printArray(arr);
	}
}
