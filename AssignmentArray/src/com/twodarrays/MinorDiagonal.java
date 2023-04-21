package com.twodarrays;

public class MinorDiagonal {
	public static int minorDiagonal(int[][] array) {
		int k = 0, j = 0;
		int sumMinD = 0;
		k = array.length - 1;
		for (j = 0, k = 0; j <= array.length && k >= 0; j++, k--) {
			sumMinD += array[j][k];
		}
		return sumMinD;
		// System.out.println(sumMind);
	}

	public static void main(String[] args) {
		int arr1[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("enter number of rows:"); int rows = sc.nextInt();
		 * 
		 * System.out.println("enter number of columns:"); int cols = sc.nextInt();
		 * System.out.println("Enter elements of array:"); int arr[][] = new
		 * int[rows][cols]; for (int i = 0; i < rows; i++) { for (int j = 0; j < cols;
		 * j++) { arr[i][j] = sc.nextInt(); } }
		 * System.out.println("Elements of array are:"); for (int i = 0; i < rows; i++)
		 * { for (int j = 0; j < cols; j++) { System.out.print(arr[i][j] + " "); }
		 * System.out.println(); }
		 */
		minorDiagonal(arr1);
	}
}
