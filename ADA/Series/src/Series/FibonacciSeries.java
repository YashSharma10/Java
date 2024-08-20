package Series;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter the number of terms for Fibonacci series:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numTerms = sc.nextInt();

		System.out.println("Fibonacci Series:");
		for (int i = 0; i < numTerms; i++) {
			System.out.print(FibonacciPattern(i) + " ");
		}

		// Calculate sum
		int sum = 0;
		for (int i = 0; i < numTerms; i++) {
			sum += FibonacciPattern(i);
		}
		System.out.println("\nSum = " + sum);

		// Search for a number
		System.out.println("\nEnter the number to search :");
		int num = sc.nextInt();
		boolean found = false;
		for (int i = 0; i < numTerms; i++) {
			if (num == FibonacciPattern(i)) {
				System.out.println("Index = " + i);
				found = true;
				break; //
			}
		}
		if (!found) {
			System.out.println("Not Found");
		}
	}

	static int FibonacciPattern(int n) {
		if (n <= 1) {
			return n;
		} else {
			return FibonacciPattern(n - 1) + FibonacciPattern(n - 2);
		}
	}
}
