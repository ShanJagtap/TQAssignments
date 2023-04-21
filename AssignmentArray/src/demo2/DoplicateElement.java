package demo2;

import java.util.Scanner;

public class DoplicateElement {
	static Scanner sc = new Scanner(System.in);

	public static void duplicateElements(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.print(" " + ar[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter elements of array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		duplicateElements(arr);
	}
}
