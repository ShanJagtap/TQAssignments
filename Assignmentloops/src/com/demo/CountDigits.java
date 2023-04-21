package com.demo;

import java.util.Scanner;

public class CountDigits {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		int count = 0;

		while (num != 0) {
			num /= 10;
			++count;
		}
		System.out.println("Number of digits in number:" + count);
		sc.close();
	}
}
