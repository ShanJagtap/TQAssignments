package com.array;

import java.util.Scanner;

public class ReverseTemp {

	public static void main(String[] args) {
		int n, temp, res, i, j = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in the array:");
		n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter " + n + " elements ");
		for (i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		for (i = 0; i < n; i++, n--) {
			temp = array[i];
			array[i] = array[n - 1];
			array[n - 1] = temp;
		}
		System.out.println("Reverse of an array is :");
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		sc.close();
	}
}
