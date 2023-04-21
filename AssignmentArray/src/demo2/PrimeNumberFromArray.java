package demo2;

public class PrimeNumberFromArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("prime numbers from array");

		for (int i = 0; i < arr.length; i++) {
			boolean isPrime = true;
			for (int j = 2; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime && arr[i] > 1) {
				System.out.println(arr[i] + " ");
			}
		}
	}
}
