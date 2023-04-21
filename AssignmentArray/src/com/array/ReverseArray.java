package com.array;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String args[]) {
		int arr[] = new int[] { 3, 90, 45, 29, 37, 38 };
		System.out.println("Original array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Reversed array");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr) + " ");

	}
}
