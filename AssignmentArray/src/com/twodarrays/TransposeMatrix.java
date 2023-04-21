package com.twodarrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		int original[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };

		int transpose[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				transpose[i][j] = original[j][i];
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}
}