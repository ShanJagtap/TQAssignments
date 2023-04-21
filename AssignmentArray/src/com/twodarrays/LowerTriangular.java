package com.twodarrays;

public class LowerTriangular {

	public static void main(String[] args) {
		int i, j, sum = 0;
		int[][] Lt_arr = { { 111, 21, 311 }, { 421, 511, 611 }, { 711, 811, 911 } };

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (i > j) {
					sum = sum + Lt_arr[i][j];
				}
			}
		}
		System.out.println("\n The Sum of the Lower Triangle Matrix =  " + sum);
	}
}
