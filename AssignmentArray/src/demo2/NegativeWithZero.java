package demo2;

import java.util.Scanner;

public class NegativeWithZero {

	public static void negativeWithZero(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < 0) {
				ar[i] = 0;
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter elements of array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.print(arr[i] + " "); }
		 */

		negativeWithZero(arr);
		System.out.println("After replacing:");
		for (int i : arr) {
			System.out.println(i + " ");
		}
		sc.close();
	}
}
