package demo2;

import java.util.Scanner;

public class SearchArray {
	public static void searchArrays(int ar[], int value) {
		boolean status = false;
		for (int i : ar) {
			if (i == value) {
				status = true;
				break;
			}
		}
		if (status) {
			System.out.println("Element is present");
		} else {
			System.out.println("Element is not present");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter Elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("Enter an array to search");
		int ele = sc.nextInt();
		searchArrays(arr, ele);
		sc.close();
	}
}
