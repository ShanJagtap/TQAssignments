package demo2;

import java.util.Scanner;

public class AlternateElements {
	public static void alternateElement(int ar[]) {
		boolean flag = true;
		for (int i : ar) {
			if (flag) {
				System.out.print(i + " ");
			}
			flag = !flag;
		}
	}

	public static void alternateElement2(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			if (i % 2 == 0) {
				System.out.print(ar[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter elements of array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements of array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		alternateElement(arr);
		System.out.println();
		alternateElement2(arr);
		sc.close();
	}

}
