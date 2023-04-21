package com.twodarrays;

public class SubtractTwoMatrix {

	public static void main(String[] args) {
		int rows, cols;
		int arr1[][] = { { 4, 5, 6 }, { 3, 4, 1 }, { 1, 2, 3 } };
		int arr2[][] = { { 2, 0, 3 }, { 2, 3, 1 }, { 1, 1, 1 } };

		rows = arr1.length;
		cols = arr1[0].length;

		int diff[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				diff[i][j] = arr1[i][j] - arr2[i][j];
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(diff[i][j] + " ");
			}
			System.out.println();
		}
	}
}
