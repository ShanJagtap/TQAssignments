package com.staticassignment;

import java.util.Scanner;

public class SumInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int result = 0;

		while (num > 0) {
			result += num % 10;
			num /= 10;
		}
		System.out.println(result);
		sc.close();
	}
}
