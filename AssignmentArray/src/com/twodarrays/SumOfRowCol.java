package com.twodarrays;

public class SumOfRowCol {

	public static void main(String[] args) {
		int rows, cols, sumrows, sumcols;
		int arr1[][] = { { 4, 5, 6 }, { 3, 4, 1 }, { 1, 2, 3 } };

		rows = arr1.length;
		cols = arr1.length;

		for (int i = 0; i < rows; i++) {
			sumrows = 0;
			for (int j = 0; j < rows; j++) {
				sumrows = sumrows + arr1[i][j];
			}
			System.out.println("sum of " + (i + 1) + " row: " + sumrows);
		}

		for (int i = 0; i < cols; i++) {
			sumcols = 0;
			for (int j = 0; j < cols; j++) {
				sumcols = sumcols + arr1[i][j];
			}
			System.out.println("sum of " + (i + 1) + " column: " + sumcols);
		}
	}
}
