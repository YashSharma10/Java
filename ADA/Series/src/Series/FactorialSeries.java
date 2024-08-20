package Series;

import java.util.Scanner;

public class FactorialSeries {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println("Factorial using recursion of " + num + " is: " + FactorialPattern(num));
		System.out.println("Factorial using iteration of " + num + " is: " + FactorialPatternIterative(num));
	}

	static int FactorialPattern(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * FactorialPattern(n - 1);
		}
	}

	static int FactorialPatternIterative(int n) {
		int mul = 1;
		if (n == 0) {
			return 1;
		} else {
			for (int i = n; i >= 1; i--) {
				mul *= i;
			}
			return mul;
		}
	}

}
