package demo2;

import java.util.Scanner;

public class CountDuplicate {
	public static void countDuplicate(int ar[]) {
		int count = 0;
		int dcount = 0;
		for (int i = 0; i < ar.length; i++) {
			count = 1;
			if (ar[i] == '\0')
				continue;
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					count++;
					ar[j] = '\0';
				}
			}
			if (count > 1) {
				dcount++;
				System.out.println(ar[i] + ": " + count);
			}
		}
		System.out.println("Number of duplicate elements are:" + dcount);
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
		System.out.println();
		// System.out.println("Enter element:");
		// int e1=sc.nextInt();
		countDuplicate(arr);
		sc.close();
	}
}
