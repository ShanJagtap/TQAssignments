package demo2;

import java.util.Scanner;

public class CountOccurance {
	public static void countOccurance(int ar[], int value) {
		boolean status = false;
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == value) {
				status = true;
				count++;
			}
		}

		if (!status) {
			System.out.println("Number is not present");
		} else {
			System.out.println("element is present: " + count + " times");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter elements of array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("Enter element you want to count:");
		int e1 = sc.nextInt();
		countOccurance(arr, e1);
		sc.close();
	}
}
