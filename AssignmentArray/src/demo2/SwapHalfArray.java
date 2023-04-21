package demo2;

import java.util.Scanner;

public class SwapHalfArray {
	public static void halfSwap(int ar[]) {
		int j = ar.length / 2;
		int temp;
		for (int i = 0; i < ar.length / 2; i++) {
			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
			j++;
		}
	}

	public static void halfSwap2(int ar[]) {
		int temp;
		for (int i = 0, j = ar.length / 2; i < ar.length / 2; i++) {
			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
		}
	}

	public static void printArray(int ar[]) {
		for (int i : ar) {
			System.out.print(i + "  ");
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

		System.out.println("Elements of array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		halfSwap(arr);
		System.out.println();
		halfSwap2(arr);
		System.out.println("after swap:");
		printArray(arr);
		sc.close();
	}
}
